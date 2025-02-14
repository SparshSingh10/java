package oops_2.Encapsulation.NormalPlayer;

public class Player {

    // public String name;
    public String FullName;
    // 1) Use 1 - name ki jagha full name kar diya kisi ne for example game ke development mai change karte hue tho
    // problme ho gi, abhi tho choti file hai to sahi karlo ge par badi files mai many problmes
    // so encapsulation is needed
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}