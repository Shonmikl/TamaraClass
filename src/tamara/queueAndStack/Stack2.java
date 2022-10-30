package tamara.queueAndStack;
//добавляем и читаем только из начала
public interface Stack2<T> {
    void push(T item); // add
    T pop(); // get
    boolean isEmpty();
}