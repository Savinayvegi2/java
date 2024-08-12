package java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);
    }
}
