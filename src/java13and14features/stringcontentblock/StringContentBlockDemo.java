package java13and14features.stringcontentblock;

public class StringContentBlockDemo {

    public static void main(String[] args) {

        /*

        String content block:

            when you want to display json or HTMl code or any other code in beautify format
            For ex:
                {
                    "Name": "Shankar"
                    "subject": "Java"
                }
            With Strings it is very difficult, you need to use \n \t characters, and it doesn't look clean

            With String content block it is very simple.
            Open """
            Close """

            withing this three inverted commas write the content in whichever format you want.
         */

        String s = """
                  {
                    "name": "Shankar"
                    "subject": "Java" 
                  }
                   """;

        System.out.println("formatted String");
        System.out.println(s);

        /* for some reason
                you want the content block to display in the same line but for readability you have added in different line
                You can do that by using \ character so contents after it comes in the same line
         */

        String s2 = """
                  {\
                    "name": "Shankar"\
                    "subject": "Java"\
                  }
                   """;

        System.out.println("formatted String in one single line");
        System.out.println(s2);

    }
}
