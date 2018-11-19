package chenzb.pattern.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenzibin on 2018/11/7.
 */
public class MouseEvent {

    private static Map<Event, Callback> callbackMap = new HashMap<>();

    public void callback(Event event) {
        callbackMap.get(event).call();
    }

    public static void registry(Event event, Callback callback) {
        callbackMap.put(event, callback);
    }


    public static enum Event {
        CLICK;
    }
}
