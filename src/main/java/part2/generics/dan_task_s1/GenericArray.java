package part2.generics.dan_task_s1;

import java.util.ArrayList;

public class GenericArray<T> {
    private int len;
    private int amount;
    private ArrayList<T> store = new ArrayList<T>();

    GenericArray(int len) {
        this.len = len;
        amount = 0;
    }

    public void add(T obj) {
        if (amount<len) {
            store.add(obj);
            amount++;
            System.out.println("Element added");
        } else {
            System.out.println("Size exceded");
        }
    }

    public void remove(T obj) {
        if(amount>0) {
            store.remove(obj);
            amount--;
        } else {
            System.out.println("Nothing to remove");
        }
    }

    public ArrayList<T> getGenericArray() {
        return (ArrayList<T>) this.store;
    }

    public String toArray() {
        return "{" + getGenericArray() + "}";
    }

    public T getElement(int index) {
        if(index>=0 && index<store.size()) {
            System.out.println(store.get(index));
            return (store.get(index));
        }
        System.out.println("Index out of array the last element returned");
        return store.get(store.size()-1);
    }

}
