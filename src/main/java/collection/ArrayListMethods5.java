package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Anvar");
        arrayList1.add("Ivan");
        arrayList1.add("Zaur");
        arrayList1.add("Kolya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Anvar");
        arrayList2.add("Ivan");
        arrayList2.add("Igor");

        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        Object [] array2 = arrayList1.toArray();
        for (Object s : array2) {
            System.out.print(s + " ");
        }

        List<String> arrayList3 = List.copyOf(arrayList1);
        System.out.println("\n" + arrayList3);

//        todo: learn subList and practice

    }
}
