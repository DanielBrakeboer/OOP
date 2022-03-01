package week2.les4.practicum_4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        String out = "";
        if (naam != null) {
            out += "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
        }
        return out;
    }
}
