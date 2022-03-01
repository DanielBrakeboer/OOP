package week2.les4.practicum_4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        String out = "";
        if (type != null) {
            out += "autotype: " + type + " met prijs per dag: " + prijsPerDag;
        }
        return out;
    }
}
