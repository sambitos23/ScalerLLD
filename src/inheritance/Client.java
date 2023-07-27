package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setName("Naman");
        instructor.setDescription("Super Cool");
        instructor.saySomething();

        User user = new User();
//        user.name = "Karthik";

        Mentor mentor = new Mentor();
//        mentor.name = "Abhimanyu";
//        mentor.email = "Abhi@gmail.com";
//        mentor.description = "Boss";
    }
}
