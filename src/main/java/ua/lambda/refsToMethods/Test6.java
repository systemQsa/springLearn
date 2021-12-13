package ua.lambda.refsToMethods;

public class Test6 {
    public static void main(String[] args) {
        /*
        //ссылка на консруктор
        когда вызовем метод будет вызван определенный конструктор класса зависит от параметров
         */
      G g = String::new;
        System.out.println(g.m(new char[]{'a','c','b'}));

      H h = String::new;
        System.out.println(h.m(new byte[]{65,66,67}));
    }

    interface G{
        String m(char[] chars);
    }

    interface H{
        String m(byte[] bytes);
    }
}
