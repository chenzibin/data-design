package chenzb.pattern.singleton.lazy;


/**
 * Created by chenzibin on 2018/11/4.
 */
public class LazySync {

    private LazySync(){
        System.out.println("lazy sync instance");
    };

    private static LazySync lazySync = null;

    public static synchronized LazySync getInstance() {
        if (lazySync == null) {
            lazySync = new LazySync();
        }
        return lazySync;
    }
}
