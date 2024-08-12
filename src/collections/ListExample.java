package collections;

import java.util.*;

class Employee implements Comparable<Employee>{

    String name;
    int age;
    public Employee(String name, int age) {
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
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}
public class ListExample {
    public static void main(String[] args) {
//        List<Employee> list = Arrays.asList(
//                new Employee("vegi",25),
//                new Employee("vinay",35)
//        );
        List<Employee> list = new ArrayList<Employee>();
//        adding elements to list
        list.add(new Employee("vegi",25));
        list.add(new Employee("vinay",35));
        list.add(new Employee("kiran",20));

        List<String> employeeList = new ArrayList<>();
        employeeList.add("ravi");
        employeeList.add("kiran");
        employeeList.add("zebra");
        employeeList.add("amit");

//        Adding all employee list into linked list by using addAll method
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        for (Employee employee : linkedList) {
            System.out.println("Adding employee list "+employee);
        }


//     Traversing employee list and getting details from
//     two different list and employeeList which have come employee
//     and returning employee details
        Iterator<Employee> iterator =list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            for (String s : employeeList) {
                if (s.equals(employee.getName())) {
                    System.out.println(employee);
                }
            }
        }

//        returning employee list based on index
        System.out.println("Returning element: "+list.get(2));

//        sorting of elements by using collections and for-each loop
        Collections.sort(employeeList);
        for (String employee: employeeList)
            System.out.println(employee);
//        traversing list through for-each loop
//        for(Employee employee:list)
//            System.out.println(employee);

    }
}
