package oops_1.inheritance;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Animal", "Large", 100);
       doAnimalStuff(animal, "slow");
        
       Dog dog =new Dog();
       doAnimalStuff(dog, "fast");
    //    we can pass dog in animal reference(means below function has Animal type still dog is fine cuz dog extend animal)
    Dog yorkie=new Dog("Yorkie",15);
    doAnimalStuff(yorkie,"fast");

    Dog retriever=new Dog("Retriever", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriever, "Slow");

    
    }
    public static void doAnimalStuff(Animal animal,String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
