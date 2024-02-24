package java13and14features.recordfeature;

public class RecordDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 10000);

        System.out.println("Employee name: " + employee.name());
        System.out.println("Employee salary: " + employee.salary());
        System.out.println("Employee object using toString(): " + employee.toString());
        System.out.println("Employee object hashcode: " + employee.hashCode());

    }
}
