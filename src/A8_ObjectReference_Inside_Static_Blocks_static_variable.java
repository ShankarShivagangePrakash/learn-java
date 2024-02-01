public class A8_ObjectReference_Inside_Static_Blocks_static_variable {

    static A8_ObjectReference_Inside_Static_Blocks_static_variable obj;
    int x;

    public static void main(String[] args) {
        System.out.println("global static object member variable value from psvm: "
                + A8_ObjectReference_Inside_Static_Blocks_static_variable.obj.x);
    }

    static{
        A8_ObjectReference_Inside_Static_Blocks_static_variable.obj =
                new A8_ObjectReference_Inside_Static_Blocks_static_variable();
        System.out.println("Global static object instantiated: " + obj.x);
    }

}
