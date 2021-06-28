import a_DTS.b_queue.Array;
import a_DTS.b_queue.ArrayQueue;
import a_DTS.b_queue.CircleArrayQueue;

/**
 * @author smn
 * @Description:
 * @date 2021/6/26 0026 10:42
 */
public class Main {
    public static void main(String[] args) {
        Array arrayQueue = new CircleArrayQueue(3);
        arrayQueue.addQueue(1);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

        arrayQueue.addQueue(2);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

        arrayQueue.addQueue(3);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

        arrayQueue.addQueue(4);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

        arrayQueue.addQueue(5);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

        arrayQueue.addQueue(6);
        arrayQueue.showQueue();
        //arrayQueue.delQueue();

    }
}
