package chenzb.pattern.observer;

/**
 * Created by chenzibin on 2018/11/7.
 */
public class Mouse extends MouseEvent {

    public void click() {
        System.out.println("click");
        this.callback(Event.CLICK);
    }
}
