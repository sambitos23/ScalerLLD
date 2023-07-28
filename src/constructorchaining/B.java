package constructorchaining;

public class B extends A {
    private int c;

    public B() {
        super("Naman"); // The super keyword always call the parent class
        System.out.println("Constructor of B");

        this.c = 3;
    }
}
