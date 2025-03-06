package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Anvar");
        arrayList1.add("Ivan");
        arrayList1.add("Zaur");
        arrayList1.add("Kolya");

        Iterator<String> iterator = arrayList1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
