package ua.lambda.refsToMethods;

public class Test3 {
    public static void main(String[] args) {
       Test3 test3 = new Test3();
       test3.n();
    }
    void n(){
        G g = () -> {
            System.out.println("Lambda#m");
           // System.out.println(this); // this object on which this current method will be called
        };
        g.m();
    }
    interface G{
        void m();
    }
}
