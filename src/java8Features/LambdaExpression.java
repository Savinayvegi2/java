package java8Features;

import java.util.Arrays;
import java.util.List;

//list of integers and should return square of integers
public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
    //should print 1,4,9,16,25
        list.stream().map(number -> number*number).forEach(System.out::println);
    }

}
