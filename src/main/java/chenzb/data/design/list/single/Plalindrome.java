package chenzb.data.design.list.single;

/**
 * todo
 *
 * @author chenzb
 * @date 2018/11/1
 */
public class Plalindrome {

    public static LinkedList parseMean(LinkedList list) {
        LinkedList pointer1 = list, pointer2 = list;
        while (pointer2.getNext() != null) {
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
            if (pointer2.getNext() != null) {
                pointer2 = pointer2.getNext();
            }
        }
        return pointer1;
    }

    public static boolean isPlalindrome(LinkedList list) {
        LinkedList pointer1 = list, pointer2 = list;
        while (pointer2.getNext() != null) {
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
            if (pointer2.getNext() != null) {
                pointer2 = pointer2.getNext();
                if (pointer2.getNext() == null) {
                    pointer1 = pointer1.getNext();
                }
            }
        }
        return false;
    }

    public static LinkedList reversal(LinkedList list) {
         LinkedList pointer = list.getNext();
         while (list.getNext() != null && list.getNext().getNext() != null) {
             pointer = reversal(list.getNext());
         }
         list.getNext().setNext(list);
         list.setNext(null);
         return pointer;
    }

    public static LinkedList reversal2(LinkedList list) {
        LinkedList preNode = null;
        LinkedList curNode = list;
        LinkedList nextNode = list.getNext();

        while(nextNode != null) {
            curNode.setNext(preNode);

            preNode = curNode;
            curNode = nextNode;
            nextNode = curNode.getNext();

        }
        curNode.setNext(preNode);

        return curNode;
    }

    public static void main(String[] args) {
        Plalindrome plalindrome = new Plalindrome();
        LinkedList list = LinkedList.produce(7);
//        System.out.println(list);
//        System.out.println((Plalindrome.parseMean(list).getContent()));
//        System.out.println(Plalindrome.isPlalindrome(list));
//        System.out.println(Plalindrome.reversal(list));
        System.out.println(Plalindrome.reversal2(list));
    }
}
