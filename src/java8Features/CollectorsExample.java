package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class CollectorsExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Savi", 25),
                new Person("Vegi", 35),
                new Person("Kiran", 55)
        );

//        Print person greater than age
        personList.stream()
                .filter(name -> name.getAge() > 55)
                .forEach(System.out::println);


//        Group of person based on age
        Map<Integer, List<Person>> listMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        listMap.forEach((age, person) -> {
            System.out.println("Age "+age+" Person "+person);
                }
        );
    }
}
