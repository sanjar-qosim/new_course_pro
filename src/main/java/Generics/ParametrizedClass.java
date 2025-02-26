package Generics;

public class ParametrizedClass {

    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//
//        Info<Integer> info2 = new Info<>(512);
//        System.out.println(info2);
//
//        int s1 = info2.getValue();
//        System.out.println(s1);


    }

//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }

//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}

class Info <T> {

    private T value;

    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}

class Parent {

    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

//class Child extends Parent {
//
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}