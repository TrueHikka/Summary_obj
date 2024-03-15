package org.example.dz_obj_summary.storage_task2;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
    private List<T> items;

    private int size;

    public Storage(int capacity) {
        this.items = new ArrayList<>();
        this.size = 0;
    }

    public void add(T item) {
        if (size == items.size()) {
            throw new IndexOutOfBoundsException("Превышена емкость хранилища. Увеличьте емкость или удалите лишний " +
                    "элемент");
        }
        items.add(item);
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Индекс вышел за пределы диапазона: " + index);
        }
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Storage{" +
                "items=" + items +
                ", size=" + size +
                '}';
    }
}
