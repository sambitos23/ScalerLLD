package overriding;

public class B extends A{
    @Override
    void doSomething() {
        super.doSomething();
        System.out.println("I am B"); // Overriding
    }
//    int doSomething() { // if the parent have the private attribute then we can do, otherwise it will override
//        return 1;
//    }
}
