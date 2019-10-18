package part2.generics.customList.notGenericsLists;

import java.util.ArrayList;

public class SimpleListOfIntegers {
    private ArrayList<Integer> myList = new ArrayList<>();

    public void addElement(Integer t){
        myList.add(t);
    }

    public Integer getElement(int index){
        return myList.get(index);
    }

    public void removeElement(Integer t){
        myList.remove(t);
    }

    @Override
    public String toString() {
        return "SimpleListOfIntegers{" +
                "myList=" + myList +
                '}';
    }
}
