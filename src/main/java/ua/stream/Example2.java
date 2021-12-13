package ua.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);

        Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(x->x,x->x*x,Integer::sum));
        collect.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
