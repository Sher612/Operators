/**
 * Relational Operators are used to compare two or more objects.
 * There are six relational operators in Java
 * < less than. The value returned will be true if the left hand side is less than the right hand side
 * > greater than. The value returned will be true if the left hand side is greater than the right hand side
 * == equal to. The value returned will be true if the left hand side is equal to the right hand side
 * != not equal to. The value returned will be true if the left hand side is not equal to the right hand side
 * <= less than or equal to. The value returned will be true if the left hand side is less than or equal to the right hand side
 * >= greater than or equal to. The value returned will be true if the left hand side is greater than or equal to the right hand side
 */
public class RelationalOperatorsDemo {
    public static void main (String[] args) {
        int x = 10, y = 5;
        System.out.println("x > y:" + (x > y));
        System.out.println("x < y:" + (x < y));
        System.out.println("x>=y:" + (x >= y));
        System.out.println("x<=y:" + (x <= y));
        System.out.println("x==y:" + (x == y));
        System.out.println("x != y:" + (x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1= " + variable1);
        System.out.println("variable2= " + variable2);
        System.out.println("variable3= " + variable3);
        System.out.println("variable1==variable2:" + (variable1 == variable2));

        System.out.println("variable1==variable3:" + (variable1 == variable3));
    }

}
