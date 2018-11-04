package chenzb.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by chenzibin on 2018/11/5.
 */
public interface CustomInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
