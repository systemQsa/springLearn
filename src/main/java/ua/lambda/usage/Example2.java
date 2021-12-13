package ua.lambda.usage;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "E");

        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.printf("%s ==> %s%n",key, value);
            }
        });
        System.out.println("~~~~~~~");
        map.forEach((k, v) -> System.out.printf("%s ==> %s%n", k, v));

    }
}
