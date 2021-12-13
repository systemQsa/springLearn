package ua.lambda.usage;

public class Test {
    public static void main(String[] args) {
        // (1) reference to static method
        G g = A::n;
        g.m();

        // (2)reference to method of instance
        A a = new A();
        // g = new A()::n2;
        g = a::n2;
        g.m();

        // (3) reference to not static method of class
        J j = A::n2;
        j.v(a);

        // (4)reference to constructor
        g = A::new;
        g.m();

        // (5) reference to array initializer
        H h = int[]::new;
        h.r(3);

        //------------------
        A a1;
        G2 g2 = A::new;
        a1 = g2.m();
        System.out.println(a1);
        H2 h2 = A::new;
        a1 = h2.m(3);
        System.out.println(a1);

    }

    interface J {
        void v(A a);
    }

    interface G {
        void m();
    }

    interface G2 {
        A m();
    }

    interface H2 {
        A m(int x);
    }

    interface H {
        int[] r(int x);
    }

    static class A {
        A() {
            System.out.println("constructor A::init");
        }

        A(int x) {
            System.out.println("A::init(int)");
        }

        static void n() {
            System.out.println("A.n");
        }

        void n2() {
            System.out.println("A.n2");
        }
    }
}
