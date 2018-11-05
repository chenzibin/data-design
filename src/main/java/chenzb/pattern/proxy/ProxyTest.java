package chenzb.pattern.proxy;

import chenzb.pattern.proxy.custom.CustomProxy;
import chenzb.pattern.proxy.custom.JdkCustomProxy;
import chenzb.pattern.proxy.dynamic.CglibProxy;
import chenzb.pattern.proxy.dynamic.JdkProxy;
import chenzb.pattern.proxy.stative.StaticProxy;
import org.junit.Test;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class ProxyTest {

    @Test
    public void testStaticProxy() {
        Person person = new Student();
        StaticProxy staticProxy = new StaticProxy(person);
        staticProxy.eat("apple");
        staticProxy.sleep();
    }

    @Test
    public void testJdkProxy() {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Person person = JdkProxy.getInstance(new Student());
        person.eat("apple");
        person.sleep();
    }

    @Test
    public void testCglibProxy() {
        Person person = (Person) new CglibProxy().getInstance(Doctor.class);
        person.eat("apple");
        person.sleep();
    }

    @Test
    public void testCustomProxy() {
        Person person = JdkCustomProxy.getInstance(new Student());
        person.eat("apple");
        person.sleep();
    }

    public static void main(String[] args) {
        new ProxyTest().testJdkProxy();
    }
}
