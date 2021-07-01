import a_DTS.c_linkedList.DoubleLinkedList.DoubleLinkedList;
import a_DTS.c_linkedList.DoubleLinkedList.DoubleNode;
import a_DTS.c_linkedList.SingleLinkedList.SingleNode;
import a_DTS.c_linkedList.SingleLinkedList.SingleLinkedList;

/**
 * @author smn
 * @Description:
 * @date 2021/6/26 0026 10:42
 */
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addByOrder(new DoubleNode(1, "1"));
        doubleLinkedList.addByOrder(new DoubleNode(4, "4"));
        doubleLinkedList.addByOrder(new DoubleNode(8, "8"));
        doubleLinkedList.addByOrder(new DoubleNode(6, "6"));
        doubleLinkedList.addByOrder(new DoubleNode(10, "10"));

        doubleLinkedList.list();

    }
}
