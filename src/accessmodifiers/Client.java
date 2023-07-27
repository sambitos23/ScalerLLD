package accessmodifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "naman";
//        student.address = ""; will not work for private access modifier
        student.email = "namam@scaler.com";
    }
}
