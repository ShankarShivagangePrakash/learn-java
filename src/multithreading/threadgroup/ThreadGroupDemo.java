package multithreading.threadgroup;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        //Currently we are in main() method this will be in main thread group let's confirm that
        System.out.println("Main method thread group name: " + Thread.currentThread().getThreadGroup().getName());

        //Main thread group's parent thread group name
        System.out.println("Main thread's parent thread group name " + Thread.currentThread().getThreadGroup().getParent().getName());

        //Creating custom thread groups with name as Parent
        ThreadGroup parentThreadGroup = new ThreadGroup("Parent");
        System.out.println( parentThreadGroup.getName() + " thread group created");

        //Let's see who is the parent of this thread group
        System.out.println("Parent of the " + parentThreadGroup.getName() + " thread group " + parentThreadGroup.getParent().getName());

        //Let's create child to this parent thread group
        ThreadGroup childThreadGroup = new ThreadGroup(parentThreadGroup, "Child");
        System.out.println("Created " + childThreadGroup.getName() + " as a child thread group of " + childThreadGroup.getParent().getName() + " thread group");

    }
}
