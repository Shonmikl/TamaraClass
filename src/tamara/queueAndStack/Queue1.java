package tamara.queueAndStack;
//Stack and Queue нужен для обхода иерархических структур
public interface Queue1<T> {
    void add(T item); // добавить
    T remove(); //удалить
    boolean isEmpty(); //проверить на пустоту
}