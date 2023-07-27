package constructor;

public class Main {
    public static void main(String[] args) {
        Student karthik = new Student("Sambit", "Mars"); // Constructor
        karthik.age = 18;
        karthik.name = "Karthik";
        karthik.address = "Scalerverse";
        karthik.state = "ACTIVE";
        karthik.pauseCourse();
        karthik.karthik(); // Method called karthik in Student

        Student pratik = new Student(); // Now it is also work, because we make a default constructor

        Student karthikCopy = new Student(karthik);
        System.out.println("----- Constructor Copy Same Values -----");
        System.out.println(karthik.name);
        System.out.println(karthikCopy.name);
        System.out.println(karthik.age);
        System.out.println(karthikCopy.age);
        karthikCopy.name = "Naman";
        karthikCopy.age = 21;
        System.out.println(karthik.name);
        System.out.println(karthikCopy.name);
        System.out.println(karthik.age);
        System.out.println(karthikCopy.age);

        System.out.println("Doing Something");
    }
}


/*
Object: Instance of a class

Constructor: Allows you to create object of a class,
Consider as method, Return an object of the same class

Default Constructor: If we don't write the constructor yourself in the class, language create a default constructor
which return a new object of that class with the value of all the default value of the type

Copy Constructor: A Constructor that creates a new object via copying the value of the attribute from another object of
the same class

Deep Copy: Where the copy of the original object are completely separate from each other
(In Java it is not possible in JS it is possible)

Sallow Copy: Where we only copy the value of the object

Garbage collector: -> Java
basically C++, C# has destructor -> Create a file and delete a file -> Which Java doesn't need to do for Garbage collector
*/
