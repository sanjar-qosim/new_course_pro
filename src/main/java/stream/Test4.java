package stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(3);
        list.add(5);

        int res = list.stream().reduce((accumulator, element) ->
                accumulator * element)
                .get();
        System.out.println(res);

//        List<Integer> list100 = new ArrayList<>();
//        int res2 = list100.stream().reduce((accumulator, element) ->
//                        accumulator * element)
//                .get();
//        System.out.println(res2);

        int res3 = list.stream().reduce(1, (accumulator, element) ->
                        accumulator * element);
        System.out.println(res3);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String res4 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(res4);

    }
}
