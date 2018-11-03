package chenzb.pattern.factory.factory;

import chenzb.pattern.factory.Fruit;
import chenzb.pattern.factory.Orange;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class OrangeFactory implements Factory {


    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
