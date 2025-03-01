package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test3 {

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();
//        list.add("Hello");

        List<? extends Number> list30 = new ArrayList<Integer>();

        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.16);
        list1.add(3.17);

        showListInfo(list1);

        ArrayList<Double> aL = new ArrayList<>();
        aL.add(3.14);
        aL.add(3.16);
        aL.add(3.17);
        System.out.println(summ(aL));

        ArrayList<Integer> aLi = new ArrayList<>();
        aLi.add(3);
        aLi.add(5);
        aLi.add(8);
        System.out.println(summ(aLi));

    }

    static void showListInfo(List<?> list){
        System.out.println("My list: " + list);
    }

    public static double summ(ArrayList<? extends Number> aL) {
        double summ = 0;
        for(Number n : aL) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
