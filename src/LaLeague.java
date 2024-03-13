public class LaLeague extends EuropeanFootballLeague{
    private String bestTeam;

    public LaLeague(String name, String country, String bestTeam) {
        super(name, country);
        this.bestTeam = bestTeam;
    }

    public String getBestTeam() {
        return bestTeam;
    }

    @Override
    public void print() {
        System.out.println("La League: Name - " + getName() + ", Country - " + getCountry() +
        ", Best Team - " + bestTeam);
    }
}