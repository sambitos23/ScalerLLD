package interfaces;

public class Human extends  Mammal implements Omnivore{
    @Override
    public void eatPlant() {
        System.out.println("Human is eating a plant");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Human is eating Animal");
    }
}
