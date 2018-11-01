package chenzb.data.design.list.single;

import lombok.Data;
import lombok.ToString;

/**
 * todo
 *
 * @author chenzb
 * @date 2018/11/1
 */
@Data
@ToString
public class LinkedList {

    private int content;

    private LinkedList next;

    public static LinkedList produce(int length) {
        return produce(1, length);
    }

    public static LinkedList produce(int index, int length) {
        LinkedList list = new LinkedList();
        list.setContent(index);
        if (index < length) {
            list.setNext(produce(index + 1, length));
        }
        return list;
    }
}
