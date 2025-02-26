package simpleCode;

public class Main {
    public static void main(String[] args) {

        CricketPlayer virat = new CricketPlayer("Virat");
        CricketPlayer rohit = new CricketPlayer("Rohit");
        FootballPlayer messi = new FootballPlayer("Messi");
        Team india = new Team("India");
        india.addPlayer(virat);
        india.addPlayer(rohit);
        india.addPlayer(messi);

        System.out.println(india.numPlayer());
        india.display();

    }
}
