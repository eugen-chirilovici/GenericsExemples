package part2.generics.customList;

import part2.generics.customList.genericList.CustomList;

public class MainClass {
    public static void main(String[] args) {
        CustomList<Integer> intList = new CustomList<>();

        intList.addElement(21);
        intList.addElement(22);
        intList.addElement(23);

        System.out.println("CustomList of Integer"+intList);
        System.out.println("Element with index 0: " + intList.getElement(0));

        int element = 21;
        System.out.println("Remove element " + element);
        intList.removeElement(21);
        System.out.println(intList);

        System.out.println("\nCustomList of String");
        CustomList<String> stringList = new CustomList<>();
        stringList.addElement("Hello");
        stringList.addElement("Eugen");
        stringList.addElement("and");
        stringList.addElement("guys");
        System.out.println(stringList);
    }
}
