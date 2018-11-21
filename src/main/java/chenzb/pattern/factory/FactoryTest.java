package chenzb.pattern.factory;

import chenzb.pattern.factory.abstractor.FruitFactory;
import chenzb.pattern.factory.factory.AppleFactory;
import chenzb.pattern.factory.simple.SimpleFactory;
import chenzb.pattern.factory.factory.OrangeFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class FactoryTest {

    @Test
    public void testSimpleFactory() {
        SimpleFactory factory = new SimpleFactory();
        Fruit fruit = factory.getFruit("Apple");
        Assert.assertEquals(fruit.getClass(), Apple.class);
        fruit.call();

        Fruit orange = factory.getFruit("Orange");
        orange.call();
    }

    @Test
    public void testFactory() {
        AppleFactory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        Assert.assertEquals(fruit.getClass(), Apple.class);
        fruit.call();

        OrangeFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();
        orange.call();
    }

    @Test
    public void testAbstractFactory() {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.getApple();
        Assert.assertEquals(fruit.getClass(), Apple.class);
        fruit.call();

        Fruit orange = factory.getOrange();
        orange.call();
    }
}
