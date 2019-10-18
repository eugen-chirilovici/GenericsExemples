package part2.generics.customList.notGenericsLists;

import java.util.ArrayList;

public class SimpleListOfString {
    private ArrayList<String> myList = new ArrayList<>();

    public void addElement(String t){
        myList.add(t);
    }

    public String getElement(int index){
        return myList.get(index);
    }

    public void removeElement(String t){
        myList.remove(t);
    }

    @Override
    public String toString() {
        return "SimpleListOfString{" +
                "myList=" + myList +
                '}';
    }
}
