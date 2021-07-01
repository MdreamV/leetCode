package a_DTS.c_linkedList.SingleLinkedList;

/**
 * @author smn
 * @Description:
 * @date 2021/6/29 0029 0:37
 */
public class Questions {

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(new SingleNode(1, "1"));
        singleLinkedList.addByOrder(new SingleNode(2, "2"));
        singleLinkedList.addByOrder(new SingleNode(4, "4"));
        singleLinkedList.addByOrder(new SingleNode(8, "8"));
        singleLinkedList.list();
        System.out.println("======================");
        printReverse(singleLinkedList);

    }

    /**
     * 1.求单链表中有效节点的个数
     * @return
     */
    public static int count(SingleLinkedList linkedList) {
        int count = linkedList.count();
        System.out.println(count);
        return count;
    }

    /**
     * 2.查找倒数第k个节点
     * @param linkedList
     * @return
     */
    public static SingleNode getNodeDes(SingleLinkedList linkedList, int k) {
        int count = linkedList.count();
        int index = count - k;
        SingleNode temp = linkedList.getHead();
        for (int i = 0; i <= index; i++) {
            if (temp.next == null) {
                throw new RuntimeException("error");
            }
            temp = temp.next;
        }
        System.out.println(temp);
        return temp;
    }

    /**
     * 反转链表
     * @param linkedList
     * @return
     */
    public static void reverse(SingleLinkedList linkedList) {
        //1.定义一个新的head
        SingleNode reverseHead = new SingleNode(0, "");
        //2.遍历老的链表，每次遍历到节点，拿出来挂到reverseHead后面。
        SingleNode head = linkedList.getHead();
        if (head.next == null) {
            System.out.println("error");
        }
        SingleNode temp = head.next;
        SingleNode next = null;
        while (temp != null) {
            //先保存temp的下一个节点
            next = temp.next;
            //如果是第一次添加，直接添加到reverseHead后面，next置空
            if (reverseHead.next == null) {
                reverseHead.next = temp;
                temp.next = null;
            } else {
                //后续添加则插入，注意temp的next要换成新的next
                temp.next = reverseHead.next;
                reverseHead.next = temp;
            }
            temp = next;
        }
        //3.把老的头节点替换到新的上(换头)
        head.next = reverseHead.next;
        SingleLinkedList.list(head);
    }


    /**
     * 逆序打印
     * @param linkedList
     */
    public static void printReverse(SingleLinkedList linkedList) {
        SingleNode head = linkedList.getHead();
        print(head.next);
    }

    public static void print(SingleNode singleNode) {
        if (singleNode.next != null) {
            print(singleNode.next);
        }
        System.out.println(singleNode);

    }

}
