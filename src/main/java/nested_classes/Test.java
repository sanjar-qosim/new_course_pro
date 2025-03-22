package nested_classes;

public class Test {

    static class A {}

    class B {
        class D {
            class E {
                static class F {}
            }
        }
    }

    void method(){
        class C {}
    }
}
