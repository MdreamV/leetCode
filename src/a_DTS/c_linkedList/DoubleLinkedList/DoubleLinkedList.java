package a_DTS.c_linkedList.DoubleLinkedList;


import a_DTS.c_linkedList.SingleLinkedList.SingleNode;

/**
 * @author smn
 * @Description:定义一个SingleLinkedList
 * @date 2021/6/28 0028 21:51
 */
public class DoubleLinkedList {
    //初始化头节点，头节点不要动
    private DoubleNode head = new DoubleNode(0, "0");

    public DoubleNode getHead () {
        return head;
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
        DoubleNode temp = head.next;

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
     * 添加（从尾部添加）
     * @param node
     */
    public void add(DoubleNode node) {
        DoubleNode temp = head;
        //链表为空
        if (head == null) {
            System.out.println("NULL!");
            return;
        }
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //退出循环，指针指向了最后一个。
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 按顺序把节点插入到链表中间
     * @param node
     */
    public void addByOrder(DoubleNode node) {
        //因为head节点不能动，所以要一个辅助指针 temp

        //temp需要是要添加位置的前一个位置
        DoubleNode temp = head;

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

        node.pre = temp;
        if (temp.next != null) {
            temp.next.pre = node;
        }


    }

    /**
     * 修改节点的信息，根据No来修改
     * @param node
     */
    public void updata(DoubleNode node) {
        DoubleNode temp = head;
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }

        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.no == node.no) {
                temp.name = node.name;
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * 删除
     * @param no
     */
    public void del(int no) {
        //对于双向链表，可以直接找到后自己删除
        DoubleNode temp = head;
        //链表为空
        if (head.next == null) {
            System.out.println("NULL!");
            return;
        }

        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                temp.pre.next = temp.next;
                //最后一个节点
                if (temp.next != null) {
                    temp.next.pre = temp.pre;
                }
            }
            temp = temp.next;

        }
    }

}
