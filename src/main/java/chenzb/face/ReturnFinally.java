package chenzb.face;

/**
 * Created by chenzibin on 2018/11/15.
 */
public class ReturnFinally {

    public static void main(String[] args) {
        System.out.println(getReturn());
    }

    public static String getReturn() {
        String ll = "111";
        try {
            return ll;
        } finally {
            ll = "222";
        }
    }
}
