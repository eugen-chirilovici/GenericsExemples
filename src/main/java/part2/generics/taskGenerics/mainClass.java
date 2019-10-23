package part2.generics.taskGenerics;

import java.security.SecureRandom;

public class mainClass {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        MyGenericClass<Double> mgc = new MyGenericClass<>();
        MyGenericClass<Integer> mgc1 = new MyGenericClass<>();
        MyGenericClass<Float> mgc2 = new MyGenericClass<>();


        System.out.println(mgc.sum(random.nextDouble() * 10, random.nextDouble() * 10));
        System.out.println(mgc1.sum(random.nextInt(10), random.nextInt(10)));
        System.out.println(mgc2.sum(random.nextFloat() * 10, random.nextFloat() * 10));


    }
}
