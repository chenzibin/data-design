package chenzb.pattern.proxy.custom;

import chenzb.pattern.proxy.Person;
import chenzb.pattern.proxy.Student;
import chenzb.pattern.proxy.stative.StaticProxy;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class JdkCustomProxy implements CustomInvocationHandler {

    public static Logger log = Logger.getLogger(StaticProxy.class.getName());

    private Person person;

    public JdkCustomProxy(Person person) {
        this.person = person;
    }

    public static Person getInstance(Person person) {
        Class<?>[] interfaces = Student.class.getInterfaces();
        return (Person) CustomProxy.newProxyInstance(person.getClass().getClassLoader(), interfaces, new JdkCustomProxy(person));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.setLevel(Level.INFO);
        System.out.println("before");

        method.invoke(person, args);

        log.info("after");
        return proxy;
    }
}
