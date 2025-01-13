package oops_2.Encapsulation.NormalPlayer;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Tim";
        // 1) look in player code
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        player.health = 200;
        // Use 2 -  direclty main mai 200 ki health do ge tho system gadbada gaya game ka,100+ health chali jaaye gi ab by directly acessing field, hence encapsulation needed
        player.loseHealth(11);
        // player.restoreHealth(1);
        System.out.println("Remaining health = " + player.healthRemaining());
        // 3) Use 3 - abhi tho sirf health ki baat hui hai, par weapon ki bhi koi value change kar sakte hai, so encapsulation is needed
        // 4 use 4 - constructor nahi banao ge tho initial data koi bhi player bana sakta hai, so encapsulation is needed
    }
}
