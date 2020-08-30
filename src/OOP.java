public class OOP {
// OBJECTS
    public static class MyClassA {
        int x = 5;

        public static void main(String[] args) {
            MyClassA myObj = new MyClassA();
            System.out.println(myObj.x); // Outputs 5
        }
    }

    public static class MyClassB {
        int x = 5;

        public static void main(String[] args) {
            MyClassB myObj1 = new MyClassB();
            MyClassB myObj2 = new MyClassB();
            System.out.println(myObj1.x); // Outputs 5
            System.out.println(myObj2.x); // Outputs 5
        }
    }

    public static class MyClassC {
        int x = 5;
    }
    static class OtherClass {
        public static void main(String[] args) {
            MyClassC myObj = new MyClassC();
            System.out.println(myObj.x);
        }
    }

// ATTRIBUTES

//    You can access attributes by creating an object of the class, and by using the dot syntax (.):
    public static class MyClassD {
        int x = 5;

        public static void main(String[] args) {
            MyClassD myObj = new MyClassD();
            System.out.println(myObj.x); //Outputs 5
        }
    }

// You can also modify attribute values:
    public static class MyClassE {
        int x;

        public static void main(String[] args) {
            MyClassE myObj = new MyClassE();
            myObj.x = 40;
            System.out.println(myObj.x); // Outputs 40
        }
    }

// Or override existing values:
    public static class MyClassF {
        int x = 10;

        public static void main(String[] args) {
            MyClassF myObj = new MyClassF();
            myObj.x = 25; // x is now 25
            System.out.println(myObj.x); // Outputs 25
        }
    }

// If you don't want the ability to override existing values, declare the attribute as final:
    public static class MyClassG {
        final int x = 10;

        public static void main(String[] args) {
            MyClassG myObj = new MyClassG();
            myObjName: John Doe
            Age: 24.x = 25; // will generate an error
            System.out.println(myObj.x);
//            MyClass.java:6: error: cannot assign a value to final variable x
//            myObj.x = 25;
//                 ^
//            1 error
        }
    }

//  If you create multiple objects of one class, you can change the attribute values in one object,
//  without affecting the attribute values in the other:

    public static class MyClassH {
        int x = 5;

        public static void main(String[] args) {
            MyClassH myObj1 = new MyClassH();
            MyClassH myObj2 = new MyClassH();
            myObj2.x = 25;
            System.out.println(myObj1.x); //Outputs 5
            System.out.println(myObj2.x); //Outputs 25
        }
    }

// You can specify as many attributes as you want:
public static class Person {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
// Outputs       Name: John Doe
// Outputs       Age: 24
    }
}

// Create a constructor:

    // Create a MyClass class
    public static class MyClassI {
        int x;  // Create a class attribute

        // Create a class constructor for the MyClass class
        public MyClassI() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            MyClassI myObj = new MyClassI(); // Create an object of class MyClass (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }// Outputs 5
    }


//  Constructors can also take parameters, which is used to initialize attributes.
    public static class MyClassJ {
        int x;

        public MyClassJ(int y) {
            x = y;
        }
        public static void main(String[] args) {
            MyClassJ myObj = new MyClassJ(5);
            System.out.println(myObj.x);
        }// Outputs 5
}

// You can have as many parameters as you want:
public static class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }// Outputs 1969 Mustang
}



}
