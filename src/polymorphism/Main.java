package polymorphism;

import java.util.List;

public class Main {

    public static void changePasswordOfAllUser(List<User> users){
//        As to avoid runtime error compiler is only allow user method of the parent class
        for (User user: users) {
            user.changeEmail();

            if (user instanceof Student) {
                System.out.println("I am a Student");
                Student student = (Student) user; // typecast the user to student
                // We are using (Student) -> we are forcing compiler to tell that now th user is Student (Typecasting)
                student.changeBatch();
            }

            if (user instanceof Mentor) {
//                Student student = (Student) user; -> class cass Exception, because we can not cast a mentor into a student
            }
        }

    }
    public static void main(String[] args) {
        User user = new TA(); // Datatype of the user variable is User
//        user.expertise = "Java"  -> It gives the error because user type is User
        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users = List.of(
                user1,
                user2,
                user3,
                new Student(),
                new Mentor(),
                user
        );
        changePasswordOfAllUser(users);
    }
}


/*
Polymorphism
Poly means many + Morphism means Form
In OOP using Polymorphism  allows you to refer to an umbrella term rather than the exact entity
-> referring the object of the child class via the variable of the parent classes
-> even though at compile time your compiler will not allow you to compile the access of the exact data class
   That's why compiler only allow to call the attributes, the methods of the class of the variable
-> Runtime do know the real class (In debugger we can show that)
 */