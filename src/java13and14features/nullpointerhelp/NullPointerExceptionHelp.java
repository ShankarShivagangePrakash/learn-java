package java13and14features.nullpointerhelp;

public class NullPointerExceptionHelp {

    public static void main(String[] args) {

        String s = null;

        /*
            Before java 14, below line was just throwing null pointer exception, not saying why the null pointer exception occurred.
            You need to add below argument to java VM arguments.
            -XX:+ShowCodeDetailsInExceptionMessages

            But it comes implicitly in later versions of java, if you are not getting detail error as below
            add that arguments to VM options.

            Exception:
                Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.indexOf(int)" because "s" is null
	            at java13and14features.nullpointerhelp.NullPointerExceptionHelp.main(NullPointerExceptionHelp.java:11)
        */

        // Uncomment this line before running.
        // System.out.println(s.indexOf(2));
    }
}
