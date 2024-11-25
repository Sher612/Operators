/**
 * Unary operators are used to increment, decrement or eliminate a value
 * Unary operators only need a single operand
 * ++increases the value by 1; -- decreases the value by 1;
 * +presents the positive value; - negates the negative value
 * ! inverts the boolean value from true to false and false to true
 */
public class UnaryOperator {
    public static void main(String[] args) {
        int sum = +1;
        // sum is now 1
        System.out.println(sum);

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        //sum is now 1
        System.out.println(sum);

        sum = -sum;
        //sum is now -1
        System.out.println(sum);

        boolean result = false;
        //false
        System.out.println(result);
        //true
        System.out.println(!result);
    }
}


