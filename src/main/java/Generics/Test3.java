package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test3 {

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();

        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.16);
        list1.add(3.17);

        showListInfo(list1);

    }

    static void showListInfo(List<?> list){
        System.out.println("My list: " + list);
    }
}
