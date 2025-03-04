package Collection;

import java.util.ArrayList;

public class ArrayListMethods3 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Anvar");
        arrayList1.add("Ivan");
        arrayList1.add("Zaur");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.addAll(arrayList1);
        arrayList2.add("!!!");

        System.out.println(arrayList2);
        arrayList2.clear();
        System.out.println(arrayList2);

        System.out.println(arrayList1.indexOf("Zaur"));
        arrayList1.add("Anvar");
        System.out.println(arrayList1.lastIndexOf("Anvar"));

        System.out.println(arrayList2.isEmpty());

        System.out.println(arrayList1.contains("Zaur"));
    }
}
