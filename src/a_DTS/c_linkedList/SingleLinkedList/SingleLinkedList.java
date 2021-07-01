package a_DTS.c_linkedList.SingleLinkedList;

/**
 * @author smn
 * @Description:定义一个SingleLinkedList
 * @date 2021/6/28 0028 21:51
 */
public class SingleLinkedList {
    //初始化头节点，头节点不要动
    private SingleNode head = new SingleNode(0, "0");

    public SingleNode getHead () {
        return head;
    }

    /**
     * 添加一个节点到链表中
     * @param singleNode
     */
    public void add(SingleNode singleNode) {
        //不考虑编号的顺序
        //找到当前链表的最后一个节点
        //最后一个节点的next指向参数

        //因为head节点不能动，所以要一个辅助指针 temp
        SingleNode temp = head;
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
        temp.next = singleNode;
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
        SingleNode temp = head.next;

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
    public static void list(SingleNode head) {
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }
        //因为head节点不能动，所以要一个辅助指针 temp
        SingleNode temp = head.next;

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
     * @param singleNode
     */
    public void addByOrder(SingleNode singleNode) {
        //因为head节点不能动，所以要一个辅助指针 temp
        //temp需要是要添加位置的前一个位置
        SingleNode temp = head;

        while (true) {
            if(temp.next == null) {
                break;
            }

            if (temp.next.no == singleNode.no) {
                throw new RuntimeException("已存在，不能添加");
            } else if (temp.next.no > singleNode.no) {
                break;
            }
            temp = temp.next;
        }

        //添加
        singleNode.next = temp.next;
        temp.next = singleNode;

    }

    /**
     * 修改节点的信息，根据No来修改
      * @param singleNode
     */
    public void update(SingleNode singleNode) {
        SingleNode temp = head.next;
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }

        while (true) {
            if (temp == null) {
                return;
            }
            if (temp.no == singleNode.no) {
                //temp = singleNode;
                temp.name = singleNode.name;
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
        SingleNode temp = head.next;
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
        SingleNode temp = head.next;
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
