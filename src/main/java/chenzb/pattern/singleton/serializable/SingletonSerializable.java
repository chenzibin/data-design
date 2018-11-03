package chenzb.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class SingletonSerializable implements Serializable {

    private SingletonSerializable() {
        System.out.println("singleton serializable instance");
    }

    private static final SingletonSerializable instance = new SingletonSerializable();

    public static SingletonSerializable getInstance() {
        return instance;
    }

    private Object readResolve() {
        System.out.println("read resolve");
        return instance;
    }
}
