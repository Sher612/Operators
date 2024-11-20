/**
 * Create a Java class named AssignmentOperatorsDemo and write the code below in that class
 */
public class AssignmentOperatorsDemo {
    public static void main(String args[]) {
        // Assigning Primitive Values
        int j, k;
        j=10; //j gets the value of 10.
        j=5; // j gets the value of 5, overwriting the previous code
        k=j; // k gets the value of 5
        System.out.println("j is: " +j);
        System.out.println("k is: " +k);

            // Multiple Assignments
        k=j=10; //(k= (j=10))
        System.out.println("j is: " +j);
        System.out.println("k is: " +k);
    }
}
