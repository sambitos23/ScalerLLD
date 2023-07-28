package constructorchaining;

public class Main {
    public static void main(String[] args) {
        C c = new C();

        System.out.println("-----------------");

        B b = new B();
    }
}


/*
When we call the constructor of the child class, before executing itself it calls the constructor of parent class
By default the constructor of the child class calls the constructor of the parents class with no attributes
*/