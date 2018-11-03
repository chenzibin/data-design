package chenzb.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class SingletonRegistryManager {

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static Object getInstance(String className) {
        if (!singletonMap.containsKey(className)) {
            try {
                singletonMap.put(className, Class.forName(className).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return singletonMap.get(className);
    }
}
