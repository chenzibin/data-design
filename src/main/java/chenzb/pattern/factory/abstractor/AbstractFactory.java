package chenzb.pattern.factory.abstractor;

import chenzb.pattern.factory.Apple;
import chenzb.pattern.factory.Banana;
import chenzb.pattern.factory.Fruit;
import chenzb.pattern.factory.Orange;

/**
 * Created by chenzibin on 2018/11/3.
 */
public abstract class AbstractFactory implements Factory {

    @Override
    public Fruit getApple() {
        return new Apple();
    }

    @Override
    public Fruit getBanana() {
        return new Banana();
    }

    @Override
    public Fruit getOrange() {
        return new Orange();
    }
}
