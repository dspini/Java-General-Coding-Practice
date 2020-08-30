public class Java_Strings {

    public static class BasicString {
        public static void main(String[] args) {
            String greeting = "Hello";
            System.out.println(greeting);
        }
    }

    public static class LengthString {
        public static void main(String[] args) {
            String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            System.out.println("The length of the txt string is: " + txt.length());
        }
    }


    public static class LetterCaseString {
        public static void main(String[] args) {
            String txt = "Hello World";
            System.out.println(txt.toUpperCase());
            System.out.println(txt.toLowerCase());
        }
    }

    public static class IndexOfString {
        public static void main(String[] args) {
            String txt = "Please locate where 'locate' occurs!";
            System.out.println(txt.indexOf("locate"));
        }
    }

    public static class ConcatString {
        public static void main(String args[]) {
            String firstName = "John";
            String lastName = "Doe";
            System.out.println(firstName + " " + lastName);
        }
    }

    public static class ConcatTwoStrings {
        public static void main(String[] args) {
            String firstName = "John ";
            String lastName = "Doe";
            System.out.println(firstName.concat(lastName));
        }
    }

//    The backslash (\) escape character turns special characters into string characters:

//    Escape character	        Result	            Description
//    \'	                    '	                Single quote
//    \"	                    "	                Double quote
//    \\	                    \	                Backslash

    public static class EscapeCharacter1 {
        public static void main(String[] args) {
            String txt = "We are the so-called \"Vikings\" from the north.";
            System.out.println(txt); //Result: We are the so-called "Vikings" from the north.
        }
    }

    public static class EscapeCharacter2 {
        public static void main(String[] args) {
            String txt = "It\'s alright.";
            System.out.println(txt); //Result: It's alright.
        }
    }

    public static class EscapeCharacter3 {
        public static void main(String[] args) {
            String txt = "The character \\ is called backslash.";
            System.out.println(txt); //Result: The character \ is called backslash.
        }
    }

//    Six other escape sequences are valid in Java:
//
//    Code	        Result
//    \n	        New Line
//    \r	        Carriage Return
//    \t	        Tab
//    \b	        Backspace
//    \f	        Form Feed

    public static class EscapeCharacter4 {
        public static void main(String[] args) {
            String txt1 = "Hello\nWorld!";
            String txt2 = "Hello\rWorld!";
            String txt3 = "Hello\tWorld!";
            String txt4 = "Hel\blo World!";
            System.out.println(txt1);
            System.out.println(txt2);
            System.out.println(txt3);
            System.out.println(txt4);
        }
    }

//    If you add two numbers, the result will be a number:

    public static class AddTwoNumbers {
        public static void main(String[] args) {
            int x = 10;
            int y = 20;
            int z = x + y;
            System.out.println(z); //Result: z will be 30 (an integer/number)
        }
    }

//    If you add two strings, the result will be a string concatenation:

    public static class AddTwoStrings {
        public static void main(String[] args) {
            String x = "10";
            String y = "20";
            String z = x + y;
            System.out.println(z); //Result: z will be 1020 (a String)
        }
    }

//    If you add a number and a string, the result will be a string concatenation:

    public static class AddNumberAndString {
        public static void main(String[] args) {
            String x = "10";
            int y = 20;
            String z = x + y;
            System.out.println(z); //Result: z will be 1020 (a String)
        }
    }




}
