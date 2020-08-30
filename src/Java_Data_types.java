public class Java_Data_types {

    public static class DataTypes {
        public static void main(String[] args) {
            int myNum = 5;               // integer (whole number)
            float myFloatNum = 5.99f;    // floating point number
            char myLetter = 'D';         // character
            boolean myBool = true;       // boolean
            String myText = "Hello";     // String
            System.out.println(myNum);
            System.out.println(myFloatNum);
            System.out.println(myLetter);
            System.out.println(myBool);
            System.out.println(myText);
        }
    }

//    There are eight primitive data types in Java:
//
//    Data Type	Size	Description
//    byte	1 byte	Stores whole numbers from -128 to 127
//    short	2 bytes	Stores whole numbers from -32,768 to 32,767
//    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//    float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//    double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//    boolean	1 bit	Stores true or false values
//    char	2 bytes	Stores a single character/letter or ASCII values

    public static class ByteType {
        public static void main(String[] args) {
            byte myNum = 100;
            System.out.println(myNum);
        }
    }

    public static class ShortType {
        public static void main(String[] args) {
            short myNum = 5000;
            System.out.println(myNum);
        }
    }

    public static class IntType {
        public static void main(String[] args) {
            int myNum = 100000;
            System.out.println(myNum);
        }
    }

    public static class LongType {
        public static void main(String[] args) {
            long myNum = 15000000000L;
            System.out.println(myNum);
        }
    }

    public static class FloatType {
        public static void main(String[] args) {
            float myNum = 5.75f;
            System.out.println(myNum);
        }
    }

    public static class DoubleType {
        public static void main(String[] args) {
            double myNum = 19.99d;
            System.out.println(myNum);
        }
    }

    public static class BooleanType {
        public static void main(String[] args) {
            boolean isJavaFun = true;
            boolean isFishTasty = false;
            System.out.println(isJavaFun);
            System.out.println(isFishTasty);
        }
    }

    public static class CharacterType {
        public static void main(String[] args) {
            char myGrade = 'B';
            System.out.println(myGrade);
        }
    }

//    In Java, there are two types of casting:
//
//    Widening Casting (automatically) - converting a smaller type to a larger type size
//    byte -> short -> char -> int -> long -> float -> double
//
//    Narrowing Casting (manually) - converting a larger type to a smaller size type
//    double -> float -> long -> int -> char -> short -> byte

    public static class WideningCasting {
        public static void main(String[] args) {
            int myInt = 9;
            double myDouble = myInt; // Automatic casting: int to double

            System.out.println(myInt);
            System.out.println(myDouble);
        }
    }

    public static class NarrowingCasting {
        public static void main(String[] args) {
            double myDouble = 9.78;
            int myInt = (int) myDouble; // Explicit casting: double to int

            System.out.println(myDouble);
            System.out.println(myInt);
        }
    }

}
