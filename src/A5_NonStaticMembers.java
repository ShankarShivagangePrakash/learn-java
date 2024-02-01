public class A5_NonStaticMembers {

    int num;

    public A5_NonStaticMembers() {
        System.out.println("Inside constructor");
    }

    //below is non static block
    {
        System.out.println("Inside Non static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the public static void main");
        new A5_NonStaticMembers();
    }
}
