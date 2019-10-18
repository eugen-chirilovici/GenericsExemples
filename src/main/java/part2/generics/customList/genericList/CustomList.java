package part2.generics.customList.genericList;

import java.util.ArrayList;

public class CustomList<T> {
    private ArrayList<T> myList = new ArrayList<>();

    public void addElement(T t){
        myList.add(t);
    }

    public T getElement(int index){
        return myList.get(index);
    }

    public void removeElement(T t){
        myList.remove(t);
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "myList=" + myList +
                '}';
    }
}
