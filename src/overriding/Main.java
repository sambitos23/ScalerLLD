package overriding;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething(); // I will come like compile time error
    }
}


/*
Method Overriding
It is Runtime Polymorphism
Where a child class has a method with exact same signature + same return type,
Child class is said to be overriding the method of the parent class
*/