package part2.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample<T> {
    public static void main(String[] args) {
        //List of grand children
        List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
        grandChildren.add(new GrandChildClass());
        addGrandChildren(grandChildren);

        //List of grand childs
        List<ChildClass> childs = new ArrayList<ChildClass>();
        childs.add(new ChildClass());
        addGrandChildren(childs);

        //List of grand supers
        List<SuperClass> supers = new ArrayList<SuperClass>();
        supers.add(new SuperClass());
        supers.add(new ChildClass());
        addGrandChildren(supers);

    }

    public static void addGrandChildren(List<? super GrandChildClass> grandChildren) {
        grandChildren.add(new GrandChildClass());
        System.out.println(grandChildren);
    }
}

class SuperClass {
    String s = "SuperClass";

    @Override
    public String toString() {
        return "SuperClass{" +
                "s='" + s + '\'' +
                '}';
    }
}

class ChildClass extends SuperClass {
    String s = "ChildClass";

    @Override
    public String toString() {
        return "ChildClass{" +
                "s='" + s + '\'' +
                '}';
    }
}

class GrandChildClass extends ChildClass {
    String s = "GrandChildClass";

    @Override
    public String toString() {
        return "GrandChildClass{" +
                "s='" + s + '\'' +
                '}';
    }
}

