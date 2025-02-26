package Generics;

import javax.print.attribute.standard.MediaSize;

public class ParametrizedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 51);
        System.out.println("Value1: " + pair1.getFirstValue() + "\bValue2: " + pair1.getSecondValue());

        OtherPair otherPair = new OtherPair("Hello", 123);
    }
}

class Pair <V1, V2> {

    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}

class OtherPair <V1> {

    private V1 value1;
    private V1 value2;

    public <V> V abc(V val) {
        return val;
    }

    public OtherPair(V1 value1, V1 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V1 getSecondValue() {
        return value2;
    }
}
