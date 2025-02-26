enum Laptop {
    MACBOOK(100), VIVOBOOK(500), WINDOWS(), IDEAPAD(50);

    private int price;

    public int getPrice() {
        return price;
    }

    public Laptop() {
        price = 99;
    }

    private Laptop(int price) {
        this.price = price;
    }

}

public class Demo {
    public static void main(String[] args) {

        // for (Laptop lap : Laptop.values()) {
        // System.out.println(lap + ":" + lap.ordinal());
        // }
        Laptop lap = Laptop.WINDOWS;
        System.out.println(lap.getPrice());
    }
}