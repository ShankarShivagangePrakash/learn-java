package java8featureshandsonindepth.lambda;

import java.util.Comparator;

public class ComparatorLambda {

    public static int compareTwoIntegers(Comparator<Integer> comparator, int a, int b){

        return comparator.compare(a,b);
    }

    public static void main(String[] args) {

        /**
         * Prior JAVA 8
         */
        Comparator<Integer> comparator  = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> if both are equal
                                        // 1 -> if o1 > o2
                                        //-1 -> if o1<o2
            }
        };

        System.out.println("Compare using comparator object created using traditional approach");
        System.out.println("Comparing 2 and 2: " + comparator.compare(2, 2));
        System.out.println("Comparing 3 and 2: " + comparator.compare(3, 2));
        System.out.println("Comparing 1 and 2: " + comparator.compare(1, 2));;

        /**
         * In JAVA 8
         */
        Comparator<Integer> comparatorLambda = (Integer  a,Integer b) -> a.compareTo(b);
        Comparator<Integer> comparatorLambda1 = (a,b) -> a.compareTo(b);

        System.out.println("Using comparator created using lambda but specified data type");
        System.out.println("Comparing 2 and 2: " + comparatorLambda.compare(2, 2));
        System.out.println("Comparing 3 and 2: " + comparatorLambda.compare(3, 2));
        System.out.println("Comparing 1 and 2: " + comparatorLambda.compare(1, 2));
        System.out.println("Using comparator created using lambda");
        System.out.println("Comparing 2 and 2: " + comparatorLambda1.compare(2, 2));
        System.out.println("Comparing 3 and 2: " + comparatorLambda1.compare(3, 2));
        System.out.println("Comparing 1 and 2: " + comparatorLambda1.compare(1, 2));

    }
}
