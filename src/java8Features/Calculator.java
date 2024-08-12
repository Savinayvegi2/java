package java8Features;


// create interface calculator and abstract method with 2 integers
@FunctionalInterface
 interface Calculator {
    int calculate(int a, int b);
}

//use calculator interface to perform addintion by using lambda expression
class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.calculate(3, 4));

    }
}
