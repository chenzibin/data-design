package chenzb.pattern.singleton.hungry;

/**
 * Created by chenzibin on 2018/11/3.
 */
public class Hungry {

    private Hungry(){
        System.out.println("hungry instance");
    };

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

}
