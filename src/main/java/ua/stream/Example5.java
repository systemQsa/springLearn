package ua.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("abcd");
        list.add("abc");


          Object o = list.stream()
                .map(String::length)
                        .collect(
                                StringBuilder::new,
                                StringBuilder::append,
                                StringBuilder::append
                        );
        System.out.println(o);
    }
}
