package enums;

public class EnumsTest {

    public static void main(String[] args) {

        // returns all enum values available for this enum
        EnumsExample[] values = EnumsExample.values();
        for (EnumsExample enumExample : values) {
            System.out.println(enumExample);
        }
    }
}
