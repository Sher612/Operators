/**
 * Logical operators return a true or false value based on the state of the variables.
 * The result is always a boolean data type
 * In a Logical AND, the return value will be true when both conditions are true
 * In a Logical OR, the return value will be true when at least one condition is true
 * In a Logical NOT, the overall result is reversed
 */
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println("x&y:" + (x & y));
        System.out.println("x&&y:" + (x && y));
        System.out.println("x|y:" + (x | y));
        System.out.println("x||y:" + (x || y));
        System.out.println("x^y:" + (x ^ y));
        System.out.println("!x:" + (!x));
    }
}
