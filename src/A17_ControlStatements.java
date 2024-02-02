public class A17_ControlStatements {

    public static void main(String[] args) {
        int a = 10, b = 20;

        //IF-ELSE
        if (a > b)
            System.out.println(" a is greater than b");
        else
            System.out.println(" b is greater than a");

        int c = 30;
        //NESTED IF-ELSE Ladder
        if (a > b)
            System.out.println(" a is greater than b");
        else if(b > c)
            System.out.println(" b is greater than a and c");
        else
            System.out.println("c is the greatest");

        //Switch statements

        int d = 2;

        switch (d) {
            case 1:
                System.out.println("value of d is 1");
                break;
            case 2:
                System.out.println("value of d is 2");
                break;
            default:
                System.out.println("value of d is not 1 or 2");
                break;
        }

        //While loop
        int e = 1;

        while (e <= 10) {
            System.out.println(e);
            e++;
        }

        //do-while

        int f = 11;
        do {
            System.out.println(f);

        } while (f <= 10);

        //For Loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //break
        for (int i = 1; i <= 10; i++) {
            if (i > 6) {
                break;
            }
            System.out.println(i);
        }

        //break in labelled blocks
        int j = 10;

        k:{
            System.out.println("Block begins");
            if (j == 10) {
                break k;
            }
            System.out.println("block ends");
        }
        System.out.println("outside block");

        //continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //infinite while loop
        /*while(true)
            System.out.println("Inside while loop");*/

        //Infinite for loop
        /*for (; ; ) {
            System.out.println("infinite for loop");
        }*/
    }
}
