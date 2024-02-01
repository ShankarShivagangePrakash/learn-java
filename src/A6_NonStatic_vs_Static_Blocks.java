public class A6_NonStatic_vs_Static_Blocks {

    int num;

    public A6_NonStatic_vs_Static_Blocks() {
        System.out.println("Inside constructor");
    }

    //below is non static block
    {
        System.out.println("Inside Non static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the public static void main");
        new A6_NonStatic_vs_Static_Blocks();
        new A6_NonStatic_vs_Static_Blocks();
        new A6_NonStatic_vs_Static_Blocks();
    }

    static{
        System.out.println("Inside static block");
    }
}
