package oops_1.inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "," + super.toString() + "]";
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }

    public void wagTail() {
        System.out.println("Dog is wagging tail");
    }

    // public void makeNoise() {
    //     System.out.println("maza aaya");
    // }
    // superclass ke function ko override karna same method name in child class se, tho child class ka use ho ga phele

}
