package nested_classes.other_tasks;

public class Car {

    String modelName;

    Car(String modelName) {
        this.modelName = modelName;
    }

    public void start(int horsePower) {
        Engine engine = new Engine(horsePower);
        System.out.println("Model name: " + modelName);
        System.out.println("Horse power of car: " + engine.horsePower);
    }

    static class Engine {
        int horsePower;

        Engine(int horsePower){
            this.horsePower = horsePower;
        }
    }
}

class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        car1.start(12);

        Car.Engine carEngine = new Car.Engine(200);
        System.out.println("Created static nested class: " + carEngine.horsePower);
    }
}