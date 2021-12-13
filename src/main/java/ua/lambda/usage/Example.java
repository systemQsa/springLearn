package ua.lambda.usage;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(5);

        list.sort((x1,x2) -> -x1 + x2);
        list.sort(Integer::compare);
        list.forEach(System.out::println);

    }
}
