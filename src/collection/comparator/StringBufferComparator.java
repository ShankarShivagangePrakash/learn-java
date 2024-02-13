package collection.comparator;

import java.util.Comparator;

// This class specifies how to compare String Buffer objects.
public class StringBufferComparator implements Comparator<StringBuffer> {

    // mention how to compare String buffer
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s1.compareTo(s2);
    }
}
