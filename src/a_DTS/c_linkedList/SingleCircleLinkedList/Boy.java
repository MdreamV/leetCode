package a_DTS.c_linkedList.SingleCircleLinkedList;

/**
 * @author smn
 * @Description:定义一个节点，每个对象就是一个节点
 * @date 2021/6/28 0028 21:49
 */
public class Boy {
    private int no;

    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }
}
