package Collection;

import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("He");
        arrayList1.add("She");
        arrayList1.add("It");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("First");
        arrayList2.add("Second");
        System.out.println(arrayList2.size());
    }
}
