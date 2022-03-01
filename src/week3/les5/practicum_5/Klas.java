package week3.les5.practicum_5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kC) {
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling l : deLeerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    public String toString() {
        String out = "";
        out += "In klas " + klasCode + " zitten de volgende leerlingen:\n";
        for (Leerling l : deLeerlingen) {
            out += l.getNaam() + " heeft cijfer: " + l.getCijfer() + "\n";
        }
        return out;
    }
}
