package nested_classes.anonymous_class;

public class AnonymousClass {

    private static int x = 5;
    private int y = 2;

    public static void main(String[] args) {
        Math2 m = new Math2() {
            AnonymousClass anonymousClass = new AnonymousClass();
            int c = 10;

            void abc(){}

            @Override
            public int doOperation(int a, int b) {
                return a + b * anonymousClass.y;
            }
        };

        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                System.out.println(x);
                return a * b;
            }
        };

        System.out.println(m.doOperation(3, 5));
        System.out.println(m2.doOperation(3, 5));

        Math3 math3 = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(math3.doOperation(5,3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}

class Math3 {
    int doOperation(int a, int b){
        return a + b;
    }
}
