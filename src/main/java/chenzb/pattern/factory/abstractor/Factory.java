package chenzb.pattern.factory.abstractor;

import chenzb.pattern.factory.Fruit;

/**
 * Created by chenzibin on 2018/11/3.
 */
public interface Factory {

    Fruit getApple();

    Fruit getBanana();

    Fruit getOrange();
}
