package ua.lambda.refsToMethods;

public class Test {
    public static void main(String[] args) {
        G g = new G() {
            @Override
            public void m() {
                A.n();
            }
        };
        g = A::n;//reference to static method of class
        g.m();

        A a = new A();
        g = a::n2;//reference to method of instance
        g.m();
//        g= new G() {
//            @Override
//            public void m() {
//                a.n2();
//            }
//        };

    }


    interface G {
        void m();
    }

    static class A {
        static void n() {
            System.out.println("A.n");
        }

        void n2() {
            System.out.println("A,n2");
        }
    }
}
