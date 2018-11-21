package chenzb.pattern.factory.simple;

import chenzb.pattern.factory.Banana;
import chenzb.pattern.factory.Fruit;
import chenzb.pattern.factory.Apple;
import chenzb.pattern.factory.Orange;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class SimpleFactory {

    public Fruit getFruit(String name) {
        switch (name) {
            case "Apple" :
                return new Apple();
            case "Banana" :
                return new Banana();
            case "Orange" :
                return new Orange();
            default:
                return new Apple();
        }
    }
}
