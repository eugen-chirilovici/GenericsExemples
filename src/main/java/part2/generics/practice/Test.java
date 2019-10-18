package part2.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Test {

    // A Generic method example
    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

//    public static <T> List<T> fromListToArray(List<T> a) {
//        return a.stream()
//                .filter(n -> (Integer) n % 2 == 0)
//                .collect(Collectors.toList());
//    }


//    public static <T> List<T> fromListToArray(List<? extends Number> a) {
//        return (List<T>) a.stream()
//                .filter(n -> n.getClass() == Integer.class)
//                .collect(Collectors.toList());
//    }

    public static <G, T> List<G> fromListToArray(List<G> a, List<T> b) {
        a.addAll((Collection<? extends G>) b);
        return a;
    }

    public static void main(String[] args) {


        List<Number> numbersList = new ArrayList<>();
        numbersList.add(26);
        numbersList.add(23L);
        numbersList.add(22.0);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(12);

        List<String> stringList = new ArrayList<>();
        stringList.add("heeei");

        List<Object> list = new ArrayList<>(numbersList);

        System.out.println(fromListToArray(integerList, stringList));

//        System.out.println(fromListToArray(numbersList));
//        System.out.println(fromListToArray(stringList));

//        List<String> stringList = Test.fromArrayToList(intArray, Object::toString);
//        System.out.println(stringList);
    }
}


