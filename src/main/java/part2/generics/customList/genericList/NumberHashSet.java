package part2.generics.customList.genericList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;

public class NumberHashSet<String, T extends Number> {

    private HashMap<String, T> setNumbers = new HashMap<String, T>();

    public void addNumber(String key, T value){
        setNumbers.put(key, value);
    }

    public T getNumberByKey(String key){
        return setNumbers.get(key);
    }
    public boolean containsNumber(T value){
        return setNumbers.containsValue(value);
    }

    public void removeNumber(String key){
        setNumbers.remove(key);
    }

    public void replaceNumber(String key, T newValue){
        setNumbers.replace(key, newValue);
    }

    public void displaySet(){
        for(HashMap.Entry<String, T> entry : setNumbers.entrySet()) {
            String key = entry.getKey();
            T value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value.toString());
        }
        System.out.println("---------------------------------");
    }
}
