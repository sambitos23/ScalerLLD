package introToOOP;

public class Main {
    public static void main(String[] args) {
        Student karthik = new Student(); // Constructor
        karthik.name = "Karthik";
        karthik.address = "Scalerverse";
        karthik.state = "ACTIVE";
        karthik.pauseCourse();
        karthik.karthik(); // Method called karthik in Student

        System.out.println("Doing Something");
    }
}
