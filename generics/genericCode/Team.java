
import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> list = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {

        if (list.contains(player)) {
            System.out.println(((Player) player).getName() + "Already present");
        } else {
            list.add(player);
            System.out.println("Player added");
        }

    }

    public int numPlayer() {
        return this.list.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }

    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public void display() {
        for (Player item : list) {
            System.out.println("Team - " + this.name + ", " + item);
        }
        System.out.println("***********************************");
    }

}