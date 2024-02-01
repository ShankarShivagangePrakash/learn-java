public class A8_ObjectReference_Inside_Static_Blocks {

    int x;

    public static void main(String[] args) {
    }

    static{
        A8_ObjectReference_Inside_Static_Blocks obj = new A8_ObjectReference_Inside_Static_Blocks();
        System.out.println(obj.x);
    }

}
