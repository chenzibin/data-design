package chenzb.pattern.singleton;

import chenzb.pattern.singleton.hungry.Hungry;
import chenzb.pattern.singleton.lazy.LazyHolder;
import chenzb.pattern.singleton.serializable.SingletonSerializable;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class SingletonTest {

    long start;
    long end;

    int count = 1000;

    CountDownLatch before;
    CountDownLatch after;

    // 类加载时，静态成员分配空间，设置默认值
    // 类首次使用时，静态成员初始化

    @Test
    public void testMoreTime() throws InterruptedException {

        long totalTime = 0L;

        for (int i = 0; i < 30; i++) {
            totalTime += testTimeConsuming();
        }

        System.out.println(String.format("总耗时：%s", totalTime));
    }

    public long testTimeConsuming() throws InterruptedException {

        before = new CountDownLatch(count);
        after = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    before.await();
//                    Hungry.getInstance();
//                    Lazy.getInstance();
//                    LazySync.getInstance();
                    LazyHolder.getInstance();
                    after.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            before.countDown();
        }

        start = System.currentTimeMillis();
        after.await();
        end = System.currentTimeMillis();

        long timeConsuming = end - start;
        System.out.println(String.format("耗时：%s", timeConsuming));
        return timeConsuming;
    }

    @Test
    public void testHungry() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Hungry.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void testLazyHolder() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazyHolder.getInstance();

        Class clazz = LazyHolder.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();

    }

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {
        SingletonSerializable read = null;
        SingletonSerializable serializable = SingletonSerializable.getInstance();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.obj"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.obj"))) {
            oos.writeObject(serializable);
            read = (SingletonSerializable) ois.readObject();
            Assert.assertEquals(serializable, read);
        }
    }
}
