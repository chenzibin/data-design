package chenzb.pattern.factory.factory;

import chenzb.pattern.factory.Banana;
import chenzb.pattern.factory.Fruit;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class BananaFactory implements Factory {

    public Fruit getFruit() {
        return new Banana();
    }
}
