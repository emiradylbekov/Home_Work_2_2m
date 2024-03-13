import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EuropeanFootballLeague [] europeanFootballLeague = {createObject("La league"),
                createObject("Premier league"), createObject("Seria A")};
        for (EuropeanFootballLeague printable : europeanFootballLeague) {
            printable.print();
        }
    }
    public static EuropeanFootballLeague createObject (String className){
        EuropeanFootballLeague europeanFootballLeague = null;

        switch (className){
            case "La league":
                europeanFootballLeague = new LaLeague("La league", "Spain", "Real Madrid");
                break;
            case "Premire league":
                europeanFootballLeague = new PremierLeague("Premier league", "England", 20);
                break;
            case "Seria A":
                europeanFootballLeague = new SeriaA("Seria A", "Italia", "Napoli");
                break;
        }
        return europeanFootballLeague;

    }

}