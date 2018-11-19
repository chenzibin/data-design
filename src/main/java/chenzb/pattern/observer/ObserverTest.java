package chenzb.pattern.observer;

import org.junit.Test;

/**
 * Created by chenzibin on 2018/11/7.
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        MouseEvent.registry(MouseEvent.Event.CLICK, ()-> {
            System.out.println("my click mouse");
        });
        Mouse mouse = new Mouse();
        mouse.click();
    }

}
