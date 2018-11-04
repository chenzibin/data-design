package chenzb.pattern.proxy;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class Doctor implements Person {
    @Override
    public void eat(String food) {
        System.out.println("doctor eat" + food);
    }

    @Override
    public void sleep() {
        System.out.println("doctor sleep");
    }
}
