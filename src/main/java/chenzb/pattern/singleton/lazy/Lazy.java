package chenzb.pattern.singleton.lazy;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class Lazy {

    private Lazy(){
        System.out.println("lazy instance");
    };

    private static Lazy lazy = null;

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
