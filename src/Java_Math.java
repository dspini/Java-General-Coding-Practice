public class Java_Math {

//    The Math.max(x,y) method can be used to find the highest value of x and y:

    public static class MathMax {
        public static void main(String[] args) {
            System.out.println(Math.max(5, 10)); //Results: 10
        }
    }

//    The Math.min(x,y) method can be used to find the lowest value of of x and y:

    public static class MathMin {
        public static void main(String[] args) {
            System.out.println(Math.min(5, 10)); //Results: 5
        }
    }

//    The Math.sqrt(x) method returns the square root of x:

    public static class MathSqrt {
        public static void main(String[] args) {
            System.out.println(Math.sqrt(64)); //Results: 8.0
        }
    }

//    The Math.abs(x) method returns the absolute (positive) value of x:

    public static class MathAbs {
        public static void main(String[] args) {
            System.out.println(Math.abs(-4.7)); //Results: 4.7
        }
    }

//    Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

    public static class MathRandom1 {
        public static void main(String[] args) {
            System.out.println(Math.random()); //Results: random
        }
    }

//    To get more control over the random number, e.g. you only want a random number between 0 and 100,
//    you can use the following formula:

    public static class MathRandom2 {
        public static void main(String[] args) {
            int randomNum = (int) (Math.random() * 101);  // 0 to 100
            System.out.println(randomNum); //Results: random
        }
    }
}