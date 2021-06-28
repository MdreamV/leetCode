package a_DTS.b_queue;

/**
 * @author smn
 * @Description:
 * @date 2021/6/26 0026 19:21
 */
public interface Array {

    boolean isFull();

    boolean isEnpty();

    void addQueue(int n);

    int delQueue();

    void showQueue();

    int peek();
}
