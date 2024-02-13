package collection.set.sortobjects;

/* here you are implementing comparable because Wrapper classes by default implement comparable to define default behaviour
 and implement Comparator interface if you need to define new behaviour.
 but for user defined class you need to implement Comparable interface to define sorting behaviour*/
public class Employee implements Comparable<Employee>{

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        int id1 = this.id;
        int id2 = o.id;

        if (id1 > id2) {
            return 1;
        } else if (id1 < id2) {
            return  -1;
        } else{
            //if ids are equal then order by name property.
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "\nEmployee object details, id: " + this.id + " name: " + this.name;
    }
}
