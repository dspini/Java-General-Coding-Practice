public class Java_Arrays {

    public static class AccessElementArray {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars[0]);
        }
    }

    public static class ChangeElementArray {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            cars[0] = "Opel";
            System.out.println(cars[0]);
        }
    }

    public static class LengthOfArray {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars.length);
        }
    }

    public static class ForLoopThroughArray {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
        }
    }

    public static class ForEachThroughArray {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
                System.out.println(i);
            }
        }
    }

    public static class MultidimensionalArray {
        public static void main(String[] args) {
            int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
            int x = myNumbers[1][2];
            System.out.println(x);
        }
    }

    public static class ForLoopMultidimensionalArray {
        public static void main(String[] args) {
            int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
            for (int i = 0; i < myNumbers.length; ++i) {
                for (int j = 0; j < myNumbers[i].length; ++j) {
                    System.out.println(myNumbers[i][j]);
                }
            }
        }
    }

}
