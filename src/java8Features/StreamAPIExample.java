package java8Features;

import java.util.Arrays;
import java.util.List;

//list of streams whose length is greater than 3 and convert them to upperCase
public class StreamAPIExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C++", "Python");
        list.stream()
                .filter(name -> name.length()>3)
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
