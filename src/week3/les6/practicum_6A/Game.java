package week3.les6.practicum_6A;

import java.time.LocalDate;

public class Game{
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int release = (LocalDate.now().getYear() - releaseJaar);
        double prijs = nieuwprijs;
        for (int i = 0; i < release; i++) {
            prijs *= 0.7;
        }
        return prijs;
    }

    public boolean equals(Object andereObject) {

        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                    this.releaseJaar == andereGame.releaseJaar){

                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }

    public String toString() { //Just Cause 3, uitgegeven in 2019; nieuwprijs: €49,98 nu voor: €34,99
        String out = "";
        out += String.format("%s, uitgegeven in %s; nieuwprijs: €%.2f nu voor: €%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
        out = out.replace(".", ",");
        return out;
    }

}
