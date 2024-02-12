package stringhandling.immutable.objectcomparision;

public class Test {

    public static void main(String[] args) {
        User user1 = new User(1, "abc");
        User user2 = new User(1, "abc");

         /*Object comparison using == operator
         even-though contents of both the objects are same, still it will return false
         because both the objects are created in different memory location note new keyword is used while creating objects.*/
        System.out.println("memory location of user 1 and user 2 is it same? " + (user1 == user2));

        /* using equals()
         equals method is available in Object class.
         In that implementation, equals method will check for memory location not values
         In collection classes, String class equals() is overridden to check for contents
         so equals method will return false, even though if the contents of both the objects are same.*/
        System.out.println("Is contents of both the objects same? " + (user1.equals(user2)));

    }
}
