package nested_classes.other_tasks;

public class AnonymClass {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, junior java developer!");
            }
        };
        greeting.sayHello();
    }
}
