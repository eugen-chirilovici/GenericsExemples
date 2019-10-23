package part2.generics.taskGenerics;

public class MyGenericClass<T extends Number> {


    public void print(T value) {
        System.out.println(value.toString());
    }

    public void printNameOfClass(T obj) {
        System.out.println("Name Of class: " + obj.getClass());
    }

    public Double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

}
