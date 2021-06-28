package a_DTS.b_queue;

/**
 * @author smn
 * @Description:
 * @date 2021/6/26 0026 18:00
 */
public class ArrayQueue implements Array{
    //最大值
    private int maxSize;

    //队列头的前一个
    private int front;

    //队列尾
    private int rear;

    //队列本身
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        //指向队列头的前一个位置
        this.front = -1;
        //指向队列尾(就是队列的最后一个数据)
        this.rear = -1;
    }

    /**
     * 判断队列是否满了
     */
    @Override
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列为空
     */
    @Override
    public boolean isEnpty() {
        return rear == front;
    }

    /**
     * 入队列
     */
    @Override
    public void addQueue(int n) {
        //判断是否满
        if (isFull()) {
            System.out.println("队列满");
            return;
        }

        this.rear++;
        arr[rear] = n;
    }

    /**
     * 出队列
     */
    @Override
    public int delQueue() {
        if (isEnpty()) {
            throw new RuntimeException("队列空");
        }
        this.front++;
        System.out.println("取出：" + arr[front]);
        return arr[front];
    }

    /**
     * 展示队列
     */
    @Override
    public void showQueue() {
        if (isEnpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "->" + arr[i]);
        }
    }

    /**
     * 查看头数据的值，不出队列
     * @return
     */
    @Override
    public int peek() {
        if (isEnpty()) {
            throw new RuntimeException("队列空");
        }
        return arr[front + 1];
    }
}


