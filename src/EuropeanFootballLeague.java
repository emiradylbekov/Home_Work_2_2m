public abstract class EuropeanFootballLeague implements Printable {
    private String name;

    private String country;

    public EuropeanFootballLeague(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    public abstract void print();
}
