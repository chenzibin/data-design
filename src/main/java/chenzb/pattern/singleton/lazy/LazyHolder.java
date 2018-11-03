package chenzb.pattern.singleton.lazy;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class LazyHolder {

    private static boolean initialized = false;

    private LazyHolder() {
        System.out.println("lazy holder instance");
    };

    public static LazyHolder getInstance() {
        return Holder.lazyHolder;
    }

    private static class Holder {
        private static final LazyHolder lazyHolder = new LazyHolder();
    }
}
