package chenzb.pattern.proxy;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class Student implements Person {
    @Override
    public void eat(String food) {
        System.out.println("student eat " + food);
    }

    @Override
    public void sleep() {
        System.out.println("student sleep");
    }
}
