public class PremierLeague extends EuropeanFootballLeague{
    private int numberOfTeams;

    public PremierLeague(String name, String country, int numberOfTeams) {
        super(name, country);
        this.numberOfTeams = numberOfTeams;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    @Override
    public void print() {
        System.out.println("Premier League: Name - " + getName() + ", Country - " + getCountry() +
                ", Number of Teams - " + numberOfTeams);
    }
}
