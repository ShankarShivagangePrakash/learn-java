package inheritence;

public class SingleInheritence {

    public void m1() {
        System.out.println("Inside m1()");
    }

    public static void main(String[] args) {
        SingleInheritence singleInheritence = new SingleInheritence();
        singleInheritence.m1();

        //below methods are not defined in SingleInheritence class still if it is available because
        //they are defined in java.lang.Object class, by default all classes will inherit this class.

        System.out.println(singleInheritence.hashCode());
        System.out.println(singleInheritence.getClass());
    }
}
