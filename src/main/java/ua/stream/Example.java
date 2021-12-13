package ua.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);

        List<Integer> list2 = list.stream()
                .filter(x -> x <= 4)
                .collect(Collectors.toList());

        System.out.println(list2);
        Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(x -> x, x -> x * 2));
        collect.forEach((k,v) -> System.out.printf("%s ==> %s%n",k,v));

    }
}
