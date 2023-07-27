package constructor;


// Encapsulation
public class Student {
    int age; // default value int -> 0
    String name; // default value str -> null
    String address = "ScalerVerse";
    String email;
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
