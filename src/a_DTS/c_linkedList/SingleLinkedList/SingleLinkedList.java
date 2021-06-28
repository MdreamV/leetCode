package a_DTS.c_linkedList.SingleLinkedList;

/**
 * @author smn
 * @Description:定义一个SingleLinkedList
 * @date 2021/6/28 0028 21:51
 */
public class SingleLinkedList {
    //初始化头节点，头节点不要动
    private Node head = new Node(0, "0");

    public Node getHead () {
        return head;
    }

    /**
     * 添加一个节点到链表中
     * @param node
     */
    public void add(Node node) {
        //不考虑编号的顺序
        //找到当前链表的最后一个节点
        //最后一个节点的next指向参数

        //因为head节点不能动，所以要一个辅助指针 temp
        Node temp = head;
        //遍历链表

        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            //没有找到，移动temp
            temp = temp.next;
        }

        //当退出循环时，temp指向了最后
        temp.next = node;
    }

    /**
     * 展示列表
      */
    public void list() {
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }
        //因为head节点不能动，所以要一个辅助指针 temp
        Node temp = head.next;

        while (true) {
            if (temp == null) {
                break;
            }
            //输出
            System.out.println(temp);
            //后移temp
            temp = temp.next;
        }
    }

    /**
     * 展示列表
     */
    public static void list(Node head) {
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }
        //因为head节点不能动，所以要一个辅助指针 temp
        Node temp = head.next;

        while (true) {
            if (temp == null) {
                break;
            }
            //输出
            System.out.println(temp);
            //后移temp
            temp = temp.next;
        }
    }

    /**
     * 按顺序把节点插入到链表中间
     * @param node
     */
    public void addByOrder(Node node) {
        //因为head节点不能动，所以要一个辅助指针 temp
        //temp需要是要添加位置的前一个位置
        Node temp = head;

        while (true) {
            if(temp.next == null) {
                break;
            }

            if (temp.next.no == node.no) {
                throw new RuntimeException("已存在，不能添加");
            } else if (temp.next.no > node.no) {
                break;
            }
            temp = temp.next;
        }

        //添加
        node.next = temp.next;
        temp.next = node;

    }

    /**
     * 修改节点的信息，根据No来修改
      * @param node
     */
    public void update(Node node) {
        Node temp = head.next;
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }

        while (true) {
            if (temp == null) {
                return;
            }
            if (temp.no == node.no) {
                //temp = node;
                temp.name = node.name;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 删除指定No的节点
     * 被删除的节点没有引用，会被GC掉
     * @param no
     */
    public void delete(int no) {
        Node temp = head.next;
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }

        while (true) {
           if (temp.next == null) {
               return;
           }

           if (temp.next.no == no) {
               temp.next = temp.next.next;
           }
           temp = temp.next;
        }
    }

    /**
     * 求单链表中有效节点的个数
     * @return
     */
    public int count() {
        int count = 0;
        Node temp = head.next;
        if (head.next == null) {
            return 0;
        }
        while (temp != null) {
            //由于倒数第二次走过之后，不会再走到这个count，所有要自增
            count++;
            temp = temp.next;
        }
        return count;
    }

}
