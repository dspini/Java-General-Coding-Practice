public class Java_Methods {

    public static class myClass1 {
        static void myMethod1() {
            System.out.println("I just got executed!"); // Outputs "I just got executed!"
        }
        public static void main(String[] args) {
            myMethod1();
        }
    }

    public static class MyClass2 {
        static void myMethod2() {
            System.out.println("I just got executed!");
        }
        public static void main(String[] args) {
            myMethod2(); // I just got executed!
            myMethod2(); // I just got executed!
            myMethod2(); // I just got executed!

        }
    }

    public static class MyClass3 {
        static void StringMethod(String fname) {
            System.out.println(fname + " Refsnes");
        }
        public static void main(String[] args) {
            StringMethod("Liam"); // Liam Refsnes
            StringMethod("Jenny"); // Jenny Refsnes
            StringMethod("Anja"); // Anja Refsnes
        }
    }

    public static class MyClass4 {
        static void StringIntMethod(String fname, int age) {
            System.out.println(fname + " is " + age);
        }
        public static void main(String[] args) {
            StringIntMethod("Liam", 5); // Liam is 5
            StringIntMethod("Jenny", 8); // Jenny is 8
            StringIntMethod("Anja", 31); // Anja is 31
        }
    }

    public static class MyClass5 {
        static int VoidKeywordMethod(int x) {
            return 5 + x;
        }
        public static void main(String[] args) {
            System.out.println(VoidKeywordMethod(3)); // Outputs 8 (5 + 3)
        }
    }

//    This example returns the sum of a method's two parameters:

    public static class MyClass6 {
        static int TwoParamMethod(int x, int y) {
            return x + y;
        }
        public static void main(String[] args) {
            System.out.println(TwoParamMethod(5, 3)); // Outputs 8 (5 + 3)
        }
    }

//    You can also store the result in a variable (recommended, as it is easier to read and maintain):

    public static class MyClass7 {
        static int VariableMethod(int x, int y) {
            return x + y;
        }
        public static void main(String[] args) {
            int z = VariableMethod(5, 3);
            System.out.println(z); // Outputs 8 (5 + 3)
        }
    }

//    It is common to use if...else statements inside methods:

    public static class MyClass8 {

        // Create a checkAge() method with an integer variable called age
        static void checkAge(int age) {

            // If age is less than 18, print "access denied"
            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");

                // If age is greater than 18, print "access granted"
            } else {
                System.out.println("Access granted - You are old enough!"); // Outputs "Access granted - You are old enough!"
            }

        }
        public static void main(String[] args) {
            checkAge(20); // Call the checkAge method and pass along an age of 20
        }
    }

//    With method overloading, multiple methods can have the same name with different parameters:
//    int myMethod(int x)
//    float myMethod(float x)
//    double myMethod(double x, double y)

    public static class MyClass9 {
        static int plusMethodInt(int x, int y) {
            return x + y;
        }

        static double plusMethodDouble(double x, double y) {
            return x + y;
        }

        public static void main(String[] args) {
            int myNum1 = plusMethodInt(8, 5);
            double myNum2 = plusMethodDouble(4.3, 6.26);
            System.out.println("int: " + myNum1); //int: 13
            System.out.println("double: " + myNum2); //double: 10.559999999999999
        }
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    public static class Main {
        public static void main(String[] args) {
            int[][] primes = new int[3][3];
            primes[2][2] = 1;

            System.out.println(primes[1][2]);
        }
    }

}
