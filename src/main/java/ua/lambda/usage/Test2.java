package ua.lambda.usage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(5);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });
        //~~~~~~~~
        list.forEach(x-> System.out.println(x));

        //~~~~~~~~
        list.forEach(System.out::println);
    }
}
