package java13and14features.recordfeature;

public class RecordDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 10000);

        System.out.println("Employee name: " + employee.name());
        System.out.println("Employee salary: " + employee.salary());
        System.out.println("Employee object using toString(): " + employee.toString());
        System.out.println("Employee object hashcode: " + employee.hashCode());


        // More concepts on Records
        // Create employee object using default constructor.
        Employee employee1 = new Employee();
        System.out.println("Default employee Details");
        System.out.println("Employee name: " + employee1.name());
        System.out.println("Employee salary: " + employee1.salary());
        System.out.println("Employee object using toString(): " + employee1.toString());
        System.out.println("Employee object hashcode: " + employee1.hashCode());

        // Create employee object using parameterized constructor of our own.
        Employee employee2 = new Employee("Ravi");
        System.out.println("Employee Ravi Details");
        System.out.println("Employee name: " + employee2.name());
        System.out.println("Employee salary: " + employee2.salary());
        System.out.println("Employee object using toString(): " + employee2.toString());
        System.out.println("Employee object hashcode: " + employee2.hashCode());

        // Invoke static method of the record
        System.out.println("Employee class static variable value: " + Employee.staticMember);

        // employee record custom method
        System.out.println("Custom method: " + Employee.getRecordName());
    }
}
