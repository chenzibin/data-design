package chenzb.mybatis.plugin;


import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * Created by chenzibin on 2018/11/22.
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {})})
public class MyPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
