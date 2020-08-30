public class Java_Operators {

//    Java divides the operators into the following groups:

//    1. Arithmetic operators
//    2. Assignment operators
//    3. Comparison operators
//    4. Logical operators
//    5. Bitwise operators

//    Arithmetic operators are used to perform common mathematical operations.

//    Operator	 Name	         Description	                           Example
//    +	         Addition	     Adds together two values	               x + y
//    -	         Subtraction	 Subtracts one value from another	       x - y
//    *	         Multiplication	 Multiplies two values	                   x * y
//    /	         Division	     Divides one value by another	           x / y
//    %	         Modulus	     Returns the division remainder	           x % y
//    ++	     Increment	     Increases the value of a variable by 1	    ++x
//    --	     Decrement	     Decreases the value of a variable by 1	    --x

    public static class ArithmeticOperators {
        public static void main(String[] args) {
            int x = 5;
            int y = 3;
            System.out.println(x + y);
            System.out.println(x - y);
            System.out.println(x * y);
            System.out.println(x / y);
            System.out.println(x % y);
        }
    }

    public static class IncrementOperator {
        public static void main(String[] args) {
            int x = 5;
            ++x;
            System.out.println(x);
        }
    }

    public static class DecrementOperator {
        public static void main(String[] args) {
            int x = 5;
            --x;
            System.out.println(x);
        }
    }

//   Assignment operators are used to assign values to variables.

//         Operator	    Example	        Same As
//  1.       = 	        x = 5	        x = 5
//  2.       +=	        x += 3	        x = x + 3
//  3.       -=	        x -= 3	        x = x - 3
//  4.       *=	        x *= 3	        x = x * 3
//  5.       /=	        x /= 3	        x = x / 3
//  6.       %=	        x %= 3	        x = x % 3
//  7.       &=	        x &= 3	        x = x & 3
//  8.       |=	        x |= 3	        x = x | 3
//  9.       ^=	        x ^= 3	        x = x ^ 3
// 10.       >>=	    x >>= 3	        x = x >> 3
// 11.       <<=	    x <<= 3	        x = x << 3

    public static class AssignmentOperator1 {
        public static void main(String[] args) {
            int x = 5;
            System.out.println(x); //Result: 5
        }
    }

    public static class AssignmentOperator2 {
        public static void main(String[] args) {
            int x = 5;
            x += 3;
            System.out.println(x); //Result: 2
        }
    }

    public static class AssignmentOperator3 {
        public static void main(String[] args) {
            int x = 5;
            x -= 3;
            System.out.println(x); //Result: 2
        }
    }

    public static class AssignmentOperator4 {
        public static void main(String[] args) {
            int x = 5;
            x *= 3;
            System.out.println(x); //Result: 5
        }
    }

    public static class AssignmentOperator5 {
        public static void main(String[] args) {
            double x = 5;
            x /= 3;
            System.out.println(x); //Result: 1.6666666666666667
        }
    }

    public static class AssignmentOperator6 {
        public static void main(String[] args) {
            int x = 5;
            x %= 3;
            System.out.println(x); //Result: 2
        }
    }

    public static class AssignmentOperator7 {
        public static void main(String[] args) {
            int x = 5;
            x &= 3;
            System.out.println(x); //Result: 1
        }
    }

    public static class AssignmentOperator8 {
        public static void main(String[] args) {
            int x = 5;
            x |= 3;
            System.out.println(x); //Result: 7
        }
    }

    public static class AssignmentOperator9 {
        public static void main(String[] args) {
            int x = 5;
            x ^= 3;
            System.out.println(x); //Result: 6
        }
    }

    public static class AssignmentOperator10 {
        public static void main(String[] args) {
            int x = 5;
            x >>= 3;
            System.out.println(x); //Result: 0
        }
    }

    public static class AssignmentOperator11 {
        public static void main(String[] args) {
            int x = 5;
            x <<= 3;
            System.out.println(x); //Result: 40
        }
    }

//    Comparison operators are used to compare two values:

//      Operator	Name	                        Example
//      ==	        Equal to	                    x == y
//      !=	        Not equal	                    x != y
//      >	        Greater than	                x > y
//      <	        Less than	                    x < y
//      >=	        Greater than or equal to	    x >= y
//      <=	        Less than or equal to	        x <= y

    public static class ComparrisonOperators {
        public static void main(String[] args) {
            int x = 5;
            int y = 3;
            System.out.println(x == y); // returns false because 5 is not equal to 3
            System.out.println(x != y); // returns true because 5 is not equal to 3
            System.out.println(x > y);  // returns true because 5 is greater than 3
            System.out.println(x < y);  // returns false because 5 is not less than 3
            System.out.println(x >= y); // returns true because 5 is greater, or equal, to 3
            System.out.println(x <= y); // returns false because 5 is neither less than or equal to 3
        }
    }

//    Logical operators are used to determine the logic between variables or values:

//    Operator	  Name	         Description	                                            Example
//    && 	      Logical and	 Returns true if both statements are true	                x < 5 &&  x < 10
//    || 	      Logical or	 Returns true if one of the statements is true	            x < 5 || x < 4
//    !	          Logical not	 Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

    public static class LogicalOperators {
        public static void main(String[] args) {
            int x = 5;
            System.out.println(x > 3 && x < 10);    // returns true because 5 is greater than 3 AND 5 is less than 10
            System.out.println(x > 3 || x < 4);     // returns true because one of the conditions are true
            System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
        }
    }

//   Bitwise operators are used to perform binary logic with the bits of an integer or long integer.
//
//    Operator	Description	                                                Example	  Same as	    Result	 Decimal
//    &	AND -   Sets each bit to 1 if both bits are 1	                    5 & 1	  0101 & 0001	0001	 1
//    |	        OR - Sets each bit to 1 if any of the two bits is 1	        5 | 1	  0101 | 0001	0101	 5
//    ~	        NOT - Inverts all the bits	                                ~ 5	      ~0101	        1010	 10
//    ^	        XOR - Sets each bit to 1 if only one of the two bits is 1	5 ^ 1	  0101 ^ 0001	0100	 4
//    <<	    Zero-fill left shift - Shift left by pushing zeroes in
//                  from the right and letting the leftmost bits fall off	9 << 1	  1001 << 1	    0010	 2
//    >>	    Signed right shift - Shift right by pushing copies of
//                  the leftmost bit in from the left and letting the
//                  rightmost bits fall off	                                9 >> 1	  1001 >> 1	    1100	 12
//    >>>	    Zero-fill right shift - Shift right by pushing zeroes
//              in from the left and letting the rightmost bits fall off	9 >>> 1	  1001 >>> 1	0100	 4

}
