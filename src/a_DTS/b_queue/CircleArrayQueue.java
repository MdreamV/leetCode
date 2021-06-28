package a_DTS.b_queue;

/**
 * @author smn
 * @Description:环形队列
 * @date 2021/6/26 0026 18:58
 */
public class CircleArrayQueue implements Array{
    //最大值
    private int maxSize;

    //队列头
    private int front;

    //队列尾
    private int rear;

    //队列本身
    private int[] arr;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        //指向队列头
        this.front = 0;
        //指向队列尾的后一个数据
        this.rear = 0;
    }

    /**
     * 判断队列是否满了
     */
    @Override
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
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

        arr[rear] = n;
        //rear后移，但是要考虑取模
        rear = (rear + 1) % maxSize;
    }

    /**
     * 出队列
     */
    @Override
    public int delQueue() {
        if (isEnpty()) {
            throw new RuntimeException("队列空");
        }
        //front已经是指向队列的第一个元素
        // 1. 先把front对应的值保存到一个临时变量。
        // 2. front后移
        // 3. 返回临时变量
        int value = arr[front];
        front = (front + 1) % maxSize;
        System.out.println("取出：" + value);
        return value;
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
        //从frout开始遍历,遍历元素个数
        int count = (rear + maxSize - front) % maxSize;
        for (int i = front; i < front + count; i++) {
            System.out.println(i % maxSize + "->" + arr[i % maxSize]);
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
        return arr[front];
    }
}
