package overloading;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print("Sambit");
    }
}


/*
Overloading
Where I am loading the same method names with multiple parameters
This type of polymorphism known as Compile Time Polymorphism

Method overloading happens when there are two or more methods with same name but different signatures
The signature is type of parameters
ex- (String, int)
    (String, String)
    (int)
-> Return type doesn't play the role in deciding overloading
*/