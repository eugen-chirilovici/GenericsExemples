package part2.generics.customList;

import part2.generics.customList.genericList.CustomList;
import part2.generics.customList.genericList.NumberHashSet;

public class MainClass {
    public static void main(String[] args) {
//        CustomList<Integer> intList = new CustomList<>();
//
//        intList.addElement(21);
//        intList.addElement(22);
//        intList.addElement(23);
//
//        System.out.println("CustomList of Integer"+intList);
//        System.out.println("Element with index 0: " + intList.getElement(0));
//
//        int element = 21;
//        System.out.println("Remove element " + element);
//        intList.removeElement(21);
//        System.out.println(intList);
//
//        System.out.println("\nCustomList of String");
//        CustomList<String> stringList = new CustomList<>();
//        stringList.addElement("Hello");
//        stringList.addElement("Eugen");
//        stringList.addElement("and");
//        stringList.addElement("guys");
//        System.out.println(stringList);

        //Test generic NumberHashSet
        System.out.println("Test Generic NumberHashSet class.");
        NumberHashSet<String, Number> setNumbers = new NumberHashSet<>();

        //add some numbers
        setNumbers.addNumber("#1", 373);
        setNumbers.addNumber("#2", 0.5);
        setNumbers.addNumber("#3", 10l);
        setNumbers.addNumber("#4", 13.6d);
        setNumbers.addNumber("#5", 0.17f);

        //display set
        setNumbers.displaySet();

        //trying to add not compatible type
//        setNumbers.addNumber("#1", "Name");

        //get a value by key
        System.out.println("Value of key #1: " + setNumbers.getNumberByKey("#1"));
        System.out.println("Value of key #5: " + setNumbers.getNumberByKey("#5"));

        //check if there is a specific number
        System.out.println("Does exist number 0.5?: " + setNumbers.containsNumber(0.5));
        System.out.println("Does exist number 100?: " + setNumbers.containsNumber(100));

        //replace value in key #4 and remove value with key #2
        setNumbers.replaceNumber("#4", 133.6d);
        setNumbers.removeNumber("#2");
        setNumbers.displaySet();
    }
}
