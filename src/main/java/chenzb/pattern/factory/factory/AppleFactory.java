package chenzb.pattern.factory.factory;

import chenzb.pattern.factory.Apple;
import chenzb.pattern.factory.Fruit;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class AppleFactory implements Factory{

    public Fruit getFruit() {
        return new Apple();
    }
}
