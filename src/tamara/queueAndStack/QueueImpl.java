package tamara.queueAndStack;

import java.util.ArrayList;

//Отрезали функционал от листа так что бы была простая очередь
public class QueueImpl<T> implements Queue1<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}