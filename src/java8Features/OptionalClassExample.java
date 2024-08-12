package java8Features;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {

//        if value is present it returns value
        Optional<String> optionalValue = Optional.of("hello");
        String value = optionalValue.orElse("x");
        System.out.println(value);

//        or else it returns default value
        Optional<String> optionalValue2 = Optional.empty();
        String string = optionalValue2.orElse("x");
        System.out.println(string);
    }
}
