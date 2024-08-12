package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
public class SetExample {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("John", 27));
        set.add(new Person("Jane", 28));
        set.add(new Person("Jack", 29));
        set.add(new Person("Jack",30));
        set.add(new Person("Jack", 27));

        Set<String> copy = new HashSet<>();
        copy.add("vinay");
        copy.add("jane");
        copy.add("jack");
        copy.add("jack");

        Iterator<String> it = copy.iterator();
        while (it.hasNext()) {
            String person = it.next();
            System.out.println(person);
        }

        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }



    }
}
