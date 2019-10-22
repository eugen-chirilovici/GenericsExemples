package part2.generics.dan_task_s1;

public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> ga = new GenericArray<>( 3);
        ga.add(4);
        ga.add(98);
        System.out.println(ga.getElement(2));
    }
}
