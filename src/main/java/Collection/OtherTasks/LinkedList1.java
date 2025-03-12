package Collection.OtherTasks;

// todo: Создай LinkedList<Integer> и заполни его числами от 1 до 5.
//       Напиши метод, который разворачивает список (меняет порядок элементов на обратный).

import java.util.LinkedList;

public class LinkedList1 {

    public static <T> LinkedList reversal(LinkedList<T> list){
        LinkedList<T> result = new LinkedList<>();
        for (T tmp : list) {
            result.add(0, tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);
        System.out.println(reversal(numbers));
    }
}
