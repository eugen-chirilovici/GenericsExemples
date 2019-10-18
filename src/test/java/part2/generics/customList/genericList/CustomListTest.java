package part2.generics.customList.genericList;

import org.junit.Test;
import part2.generics.customList.notGenericsLists.SimpleListOfIntegers;
import part2.generics.customList.notGenericsLists.SimpleListOfString;

public class CustomListTest {

    @Test
    public void testCustomList() {
        CustomList<Integer> intList = new CustomList<>();
        intList.addElement(21);
        intList.addElement(22);
        intList.addElement(23);
        System.out.println("CustomList of Integer: " + intList);

        System.out.println("Element with index 0: " + intList.getElement(0));

        int element = 21;
        System.out.println("Remove element " + element);
        intList.removeElement(21);
        System.out.println(intList);


        CustomList<String> stringList = new CustomList<>();
        stringList.addElement("Hello");
        stringList.addElement("Eugen");
        stringList.addElement("and");
        stringList.addElement("guys");
        System.out.println("\nCustomList of String: " + stringList);
    }

    @Test
    public void testSimpleList() {
        SimpleListOfIntegers listOfIntegers = new SimpleListOfIntegers();
        listOfIntegers.addElement(23);
        listOfIntegers.getElement(0);
        listOfIntegers.removeElement(23);

        SimpleListOfString simpleListOfString = new SimpleListOfString();
        simpleListOfString.addElement("Hello");
        simpleListOfString.getElement(0);
        simpleListOfString.removeElement("Hello");
    }
}