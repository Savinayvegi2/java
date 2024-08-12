package collections;

import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    int age;
    public Student(String name, int age) {
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
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
public class MapExample2 {
    public static void main(String[] args) throws Exception {
        Map<String, Student> students = new HashMap<>();
        students.put("Jack", new Student("John", 18));
        students.put("Jane", new Student("Jane", 17));
        students.put("Jack", new Student("Jack", 18));
        students.put("Mary", new Student("Mary", 19));
        students.put("Bob", new Student("Bob", 20));

        //        display student records
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String name = entry.getKey();
            Student s = entry.getValue();
            System.out.println("Name: " + name + ", " + s);
        }

//        checks if specific student Name exists or not
        boolean hasStudent = students.containsKey("Jack");
        if (hasStudent) {
            System.out.println(students.get("Jack"));
        } else {
            throw new Exception("Student not found");
        }

//        retrieve and print specific students if exist otherwise throws exception
        Student student = students.get("kiran");
        if (student != null) {
            System.out.println(student);
        } else {
            throw new Exception("Student not found");
        }

    }
}
