package Collection.OtherTasks;

import java.util.ArrayList;

//   todo:Создай ArrayList<String>, добавь в него несколько имен, некоторые из них должны повторяться.
//        Напиши метод, который удаляет дубликаты, сохраняя только первое вхождение каждого элемента.

public class ArrayList1 {

    public static <T> ArrayList deleteDuplicates(ArrayList<T> list){
        ArrayList<T> list1 = new ArrayList<>();
        for (T tmp : list) {
            if(!list1.contains(tmp)){
                list1.add(tmp);
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(deleteDuplicates(numbers));
    }
}
