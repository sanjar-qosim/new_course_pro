package Generics.OtherTasks;

public class Pair <T, U> {

    private T first;
    private U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Pair<U, T> swapPair() {
        return new Pair<>(second, first);
    }
}

class PairTest{

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair); // Должно вывести: (Age, 25)

        Pair<Integer, String> swappedPair = pair.swapPair();
        System.out.println(swappedPair); // Должно вывести: (25, Age)
    }
}