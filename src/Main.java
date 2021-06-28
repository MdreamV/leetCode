import a_DTS.b_queue.Array;
import a_DTS.b_queue.ArrayQueue;
import a_DTS.b_queue.CircleArrayQueue;
import a_DTS.c_linkedList.SingleLinkedList.Node;
import a_DTS.c_linkedList.SingleLinkedList.SingleLinkedList;

/**
 * @author smn
 * @Description:
 * @date 2021/6/26 0026 10:42
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.addByOrder(new Node(1, "1"));
        singleLinkedList.addByOrder(new Node(2, "2"));
        singleLinkedList.addByOrder(new Node(4, "4"));
        singleLinkedList.addByOrder(new Node(8, "8"));

        singleLinkedList.list();

        singleLinkedList.delete(3);
        singleLinkedList.list();

    }
}
