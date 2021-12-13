package ua.lambda;

public class Test2 {
    static int y;

    public static void main(String[] args) {
        G g;
        g = (s,x)-> s.charAt(x);
        System.out.println(g.m("Sasha", 2));
    }

    interface G {
        char m(String s,int x);
    }
}
