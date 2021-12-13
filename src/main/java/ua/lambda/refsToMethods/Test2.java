package ua.lambda.refsToMethods;

public class Test2 {
    public static void main(String[] args) {
        G g = () -> {
            System.out.println("Lambda#m");
           // System.out.println(this);//<==== error in lambda
        };
        g.m();

        g= new G() {
            @Override
            public void m() {
                System.out.println("Anonymous#m");
               // System.out.println(this);// at anonymous class ok
            }
        };
        g.m();
    }

    interface G{
        void m();
    }
}

