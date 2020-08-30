public class Java_Control_Statements {

    public static class IfStatement {
        public static void main(String[] args) {
            if (20 > 18) {
                System.out.println("20 is greater than 18");
            }
        }
    }

    public static class IfElseStatement {
        public static void main(String[] args) {
            int time = 20;
            if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
        }
    }

    public static class SwitchCase1 {
        public static void main(String[] args) {
            int day = 4;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }

    public static class SwitchCase2 {
        public static void main(String[] args) {
            int day = 4;
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
    }

    public static class SwitchCaseDefault1 {
        public static void main(String[] args) {
            int day = 4;
            switch (day) {
                case 6:
                    System.out.println("Today is Saturday");
                    break;
                case 7:
                    System.out.println("Today is Sunday");
                    break;
                default:
                    System.out.println("Looking forward to the Weekend");
            }
        }
    }

    public static class SwitchCaseDefault2 {
        public static void main(String[] args) {
            int day = 4;
            switch (day) {
                case 6 -> System.out.println("Today is Saturday");
                case 7 -> System.out.println("Today is Sunday");
                default -> System.out.println("Looking forward to the Weekend");
            }
        }
    }

    public static class WhileLoop {
        public static void main(String[] args) {
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }
        }
    }

    public static class DoWhileLoop {
        public static void main(String[] args) {
            int i = 0;
            do {
                System.out.println(i);
                i++;
            }
            while (i < 5);
        }
    }

    public static class ForLoop1 {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }
    }

    public static class ForLoop2 {
        public static void main(String[] args) {
            for (int i = 0; i <= 10; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    public static class ForEachLoop {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
                System.out.println(i);
            }
        }
    }

    public static class Break {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i == 4) {
                    break;
                }
                System.out.println(i);
            }
        }
    }

    public static class Continue {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i == 4) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}