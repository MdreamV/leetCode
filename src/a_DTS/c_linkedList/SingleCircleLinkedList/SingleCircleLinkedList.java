package a_DTS.c_linkedList.SingleCircleLinkedList;

/**
 * @author smn
 * @Description:
 * @date 2021/7/1 0001 20:25
 */
public class SingleCircleLinkedList {
    //创建一个head
    private Boy first = null;

    public Boy getFirst() {
        return first;
    }

    /**
     * 添加节点
     * @param num
     */
    public void addBoy(int num) {
        //数据校验
        if (num < 1) {
            System.out.println("error");
            return;
        }

        //指向自己的一个辅助指针
        Boy curBoy = null;
        for (int i = 1; i <= num; i++) {
            //根据no创建
            Boy boy = new Boy(i);
            //如果是第一个
            if(i == 1) {
                first = boy;
                //构成环
                first.setNext(boy);
                //辅助指针
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    /**
     * 遍历链表
      */
    public void showBoy() {
        if (first == null) {
            System.out.println("error");
            return;
        }
        //first不能动，所以使用辅助指针
        Boy curBoy = first;
        while (true) {
            System.out.println("no = " + curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }

    }
}
