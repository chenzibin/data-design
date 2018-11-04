package chenzb.pattern.proxy.dynamic;

import chenzb.pattern.proxy.stative.StaticProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chenzibin on 2018/11/5.
 */
public class CglibProxy implements MethodInterceptor {

    public static Logger log = Logger.getLogger(StaticProxy.class.getName());

    public Object getInstance(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.setLevel(Level.INFO);
        System.out.println("before");

        methodProxy.invokeSuper(o, objects);

        log.info("after");
        return o;
    }
}
