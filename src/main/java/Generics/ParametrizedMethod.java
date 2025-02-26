package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {

    public static void main(String[] args) {
        ArrayList <Integer> aL1 = new ArrayList<>();
        aL1.add(10);
        aL1.add(20);
        aL1.add(5);

        int a = GenMethod.getSecondElement(aL1);
        System.out.println(a);

        ArrayList <String> aL2 = new ArrayList<>();
        aL2.add("abc");
        aL2.add("def");
        aL2.add("gi");

        String s = GenMethod.getSecondElement(aL2);
        System.out.println(s);
    }
}

class GenMethod {

    public static <T> T getSecondElement(ArrayList <T> aL){
        return aL.get(1);
    }
}

