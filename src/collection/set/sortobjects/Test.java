package collection.set.sortobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        Set<Employee> employeeSet = new TreeSet<>();

        employeeSet.add(new Employee(1, "def"));
        employeeSet.add(new Employee(1, "abc"));
        employeeSet.add(new Employee(100, "mno"));
        employeeSet.add(new Employee(50, "mnoafdf"));

        System.out.println("Employee Set: " + employeeSet);
    }
}
