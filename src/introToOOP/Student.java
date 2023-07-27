package introToOOP;


// Encapsulation
public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;

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
