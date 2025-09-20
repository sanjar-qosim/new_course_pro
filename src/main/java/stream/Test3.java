package stream;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        int [] arr = {5, 9, 3, 8, 1};

//        Arrays.stream(arr).forEach(el -> {
//            el *= 2;
//            System.out.println(el);
//        });

//        Arrays.stream(arr).forEach(System.out::println);

        Arrays.stream(arr).forEach(Utils::myMethod);
//        Arrays.stream(arr).forEach(el -> Utils.myMethod(el));
    }
}

class Utils {

    public static void myMethod(int a) {
        System.out.println("\nOld element: " + a);
        a = a + 5;
        System.out.println("New element: " + a);
    }
}