public class A14_Primitive_to_Object {

    public static void main(String[] args) {

        //Convert primitive int to Integer
        int x = 100;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        //Convert Integer to primitive int
        int z = y.intValue();
        System.out.println(z);

        //byte to Byte
        byte a = 50;
        Byte b = Byte.valueOf(a);
        System.out.println(b);

        //Byte to byte
        byte c = b.byteValue();
        System.out.println(c);

        //Primitive to String
        byte d = 50;

        //Use wrapper class and toString() method
        String e = Byte.toString(b);
        System.out.println(e);

        byte f = Byte.parseByte(e);
        System.out.println(f);

        //Long to String
        long g = 150;
        Long h = Long.valueOf(5);
        String i = h.toString();

        //String to Object
        Long j = Long.valueOf(i);

        //primitive type to Object using constructor
        long k = 100;
        Long l = new Long(k);

        String m = "100";
        Long n = new Long(m);

    }
}
