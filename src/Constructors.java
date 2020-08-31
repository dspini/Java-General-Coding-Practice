public class Constructors {
    // Scan.java

    public static class Scan {
        String hero;

        // Constructor
        Scan() {
            this.hero = "Ironman";
        }

        public static void main(String[] args) {
            Scan obj = new Scan();
            System.out.println(obj.hero);
        }
    }
//    Some important rules for creating any constructor:

//    1. The constructor name must be the same as the class name.

//    2. It must not have any return value explicitly.

//    3. A java constructor cannot be abstract, final and synchronized.

//    4. Every class has the constructor whether it’s a regular class or an abstract class.

//    5. If you don’t implement any constructor within the class, the compiler will do it for you.

//    6. Constructor overloading is possible but overriding is not possible.
//       This means we can have an overloaded constructor in our class,
//       but we can’t override a constructor.

//    7. If Superclass doesn’t have a no-arg(default) constructor,
//       then the compiler would not insert a default constructor in a child class
//       as it does in a standard scenario.

//    8. Interfaces do not have constructors.

//    9. A constructor can also invoke another constructor of the same class.
//       By using this(). If you want to invoke the parameterized constructor,
//       then do it like the following: this(parameter list).

//    10. Constructors cannot be inherited.


//    Why we use default constructor?

//    We use the default constructor to provide default values
//    (0, null, etc.) to objects.

//    Let see an example to understand this correctly.

// DefaultCons.java

    //default constructor which displays the default values
    static class DefaultCons
    {
        int length;
        String name;

        //method to display the value of id and name
        void display()
        {
            System.out.println(length+" "+name);
        }

        public static void main(String args[])
        {
            //creating objects
            DefaultCons d1=new DefaultCons();
            DefaultCons d2=new DefaultCons();

            //displaying values of the object
            d1.display();
            d2.display();
        }
    }


}
