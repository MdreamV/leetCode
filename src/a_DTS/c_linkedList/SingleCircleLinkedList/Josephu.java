package a_DTS.c_linkedList.SingleCircleLinkedList;

import a_DTS.c_linkedList.SingleLinkedList.SingleLinkedList;
import a_DTS.c_linkedList.SingleLinkedList.SingleNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author smn
 * @Description:约瑟夫问题
 * @date 2021/7/1 0001 20:17
 */
public class Josephu {
    public static void main(String[] args) {
        SingleCircleLinkedList linkedList = new SingleCircleLinkedList();
        //一共有多少个人
        int n = 5;
        //从第几个开始
        int k = 1;
        //数几次
        int m = 2;

        linkedList.addBoy(n);
        linkedList.showBoy();
        System.out.println("===");

        Boy helper = linkedList.getFirst();
        //先把helper指针指向最后一个
        while (true) {
            if(helper.getNext() == linkedList.getFirst()) {
                break;
            }
            helper = helper.getNext();
        }
        //curBoy为当前的那一个
        Boy curBoy = helper.getNext();

        //找到要开始数的那一个
        for (int i = 0; i < k - 1; i++) {
            curBoy = curBoy.getNext();
            helper = helper.getNext();
        }

        while (true) {
            //前一个就是自己的时候证明当前只有之后一个节点了
            if (curBoy == helper) {
                System.out.println("no: " + curBoy.getNo());
                break;
            }
            //报数往后移动m-1
            for (int i = 0; i < m - 1; i++) {
                curBoy = curBoy.getNext();
                helper = helper.getNext();
            }
            //打出当前的那一个
            System.out.println("no: " + curBoy.getNo());
            //把这个删除掉
            curBoy = curBoy.getNext();
            helper.setNext(curBoy);
        }
    }
    
}
