package ua.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("abcd");
        list.add("abc");
        list.add("@@");
        list.add("AB");
        list.add("XC");

        Object o = list.parallelStream()
                //.map(String::length)
                .map(s ->{
                    System.out.println(Thread.currentThread());
                    return s.length();
                }).collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        (a,s) ->{
                            //System.out.println(Thread.currentThread());
                            //a.append(s);
                        }
                );
        System.out.println(o);
    }
}
