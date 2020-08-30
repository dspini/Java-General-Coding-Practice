public class Java_Variables {

    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }

//    int myNum = 5;
//    float myFloatNum = 5.99f;
//    char myLetter = 'D';
//    boolean myBool = true;
//    String myText = "Hello";

    public static class DeclaringVariable {
        public static void main(String[] args) {
            String name = "John";
            System.out.println(name);
        }
    }

    public static class NumberVariable {
        public static void main(String[] args) {
            int myNum = 15;
            System.out.println(myNum);
        }
    }

    public static class UndeclaredNumberVariable {
        public static void main(String[] args) {
            int myNum;
            myNum = 15;
            System.out.println(myNum);
        }
    }

    public static class NewValueNumberVariable {
        public static void main(String[] args) {
            int myNum = 15;
            myNum = 20;
            System.out.println(myNum);
        }
    }

//    public static class FinalVariable {
//        public static void main(String[] args) {
//            final int myNum = 15;
//            myNum = 20; // will generate an error: cannot assign a value to a final variable.
//            System.out.println(myNum);
//        }
//    }

    public static class DisplayVariable {
        public static void main(String[] args) {
            String name = "John";
            System.out.println("Hello " + name);
        }
    }

    public static class ConcatVariables {
        public static void main(String[] args) {
            String firstName = "John ";
            String lastName = "Doe";
            String fullName = firstName + lastName;
            System.out.println(fullName);
        }
    }

    public static class IntegerVariables {
        public static void main(String[] args) {
            int x = 5;
            int y = 6;
            System.out.println(x + y);
        }
    }


    public static class DeclareManyVariables {
        public static void main(String[] args) {
            int x = 5, y = 6, z = 50;
            System.out.println(x + y + z);
        }
    }

}
