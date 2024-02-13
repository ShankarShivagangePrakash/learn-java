package collection.set.sortobjects;

import collection.comparator.EmployeeComparator;

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

        // Tree set using comparator, note: use comparator when comparable is already implemented by class, and you need additional behaviour.
        Set<Employee> employeeSet2 = new TreeSet<>(new EmployeeComparator());

        employeeSet2.add(new Employee(1000, "def"));
        employeeSet2.add(new Employee(500, "abc"));
        employeeSet2.add(new Employee(100, "mno"));
        employeeSet2.add(new Employee(50, "mnoafdf"));

        System.out.println("\nEmployee Set: " + employeeSet2);


    }
}
