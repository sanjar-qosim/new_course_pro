package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("He");
        arrayList1.add("She");
        arrayList1.add("It");

        for (String aL : arrayList1) {
            System.out.println(aL);
        }

        arrayList1.add(1, "They");

        System.out.println(arrayList1);

        System.out.println(arrayList1.get(2));
        arrayList1.set(2, "Her");
        System.out.println(arrayList1.get(2));
        arrayList1.remove(2);
        System.out.println(arrayList1);

    }
}
