package java18features.switchdemo;

public class ExhaustiveSwitch {
    public static void main(String[] args) {
        Object object = 5;

        switch (object) {

            case Integer i -> System.out.println("Integer type object");
            case String s -> System.out.println("String type object");
            // There will be warning till you add default case, because you have not covered all possible values for switch parameter.
            // i.e Double, Long etc..
            default -> System.out.println("Default type object");
        }
    }
    
}
