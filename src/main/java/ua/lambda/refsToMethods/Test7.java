package ua.lambda.refsToMethods;

import java.util.Arrays;

//ссылка на инициализатор массива
public class Test7 {
    public static void main(String[] args) {
     G g = int[]::new;
        System.out.println(Arrays.toString(g.m(5)));

        J j = String[]::new;
    }

    interface G{
        int[] m(int x);
    }
   interface J{
        Object[] m(int x);
    }
}
