public class SeriaA extends EuropeanFootballLeague{
    private String defendingChampions;

    public SeriaA(String name, String country, String defendingChampions) {
        super(name, country);
        this.defendingChampions = defendingChampions;
    }
    public String getDefendingChampions() {
        return defendingChampions;
    }

    @Override
    public void print() {
        System.out.println("Seria A: Name - " + getName() + ", Country - " + getCountry() +
                ", Defending champions - " + defendingChampions);
    }
}
