package Collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(8);
        set.add(10);

        System.out.println(set);

        set.remove(8);
        System.out.println(set);

        System.out.println(set.contains(8));
        System.out.println(set.contains(10));
    }
}
