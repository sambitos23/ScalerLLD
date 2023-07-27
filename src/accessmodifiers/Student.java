package accessmodifiers;


// Encapsulation
public class Student {
    int age; // default value int -> 0
    String name; // default value str -> null
    private String address = "ScalerVerse";
    public String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student() {} // Work as default Constructor

    Student(Student other) { // Copy Constructor
        age = other.age;
        name = other.name;
        address = other.address;
        psp = other.psp;
        email = other.email;
        batch = other.batch;
        state = other.state;
    }

    void changeBatch(String newBatch){
        batch = newBatch;
    }

    void pauseCourse(){
        this.state = "PAUSED";
    }

    void karthik() {
        System.out.println("Karthik");
    }
}


/*
Access Modifier:
Protect attribute/method of a class from outside access
They are 4 kind of -
Public: Can be accessed any client, class anywhere in the codebase
Private: Can be accessed by none, not even the child class. It can be access only within the class. This class is still
in the memory but can not access them
Protected:
Default: Package Private (Only can call from same package) -> If we don't specify anything then it is called s default
 */
