package stream;

import java.util.Arrays;

public class Test5_1 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 1, 9, 12, 7};

        int result = Arrays.stream(arr)
                .filter(e -> e % 2 == 1)
                .reduce((a, e) -> a + e)
                .getAsInt();
        System.out.println(result);
    }
}
