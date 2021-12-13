package ua.lambda.refsToMethods;

public class Test4 {
    public static void main(String[] args) {
      G g = A::n3;
      g.m(new A());
    }
    interface G{
        void m(A a);
    }
    static class A{
        void n3(){
           System.out.println("A.n3");
       }
    }
}
