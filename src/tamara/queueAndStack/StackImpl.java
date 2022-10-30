package tamara.queueAndStack;

import java.util.ArrayList;

public class StackImpl<T> implements Stack2<T>{
   ArrayList<T> list = new ArrayList<>();
    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}