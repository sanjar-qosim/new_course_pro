package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        // 6 9 2 4
        List<Integer> list2 = list.stream().map(element -> element.length()).
                collect(Collectors.toList());

        System.out.println(list2);
    }
}
