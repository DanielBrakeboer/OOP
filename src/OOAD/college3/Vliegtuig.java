package OOAD.college3;

import java.time.LocalDate;

public class Vliegtuig {
    private String naam;
    private LocalDate datumInGebruik;
    private LuchtvaartMaatschappij luchtvaartMaatschappij;

    public Vliegtuig(LuchtvaartMaatschappij lvm) {
        this.luchtvaartMaatschappij = lvm;
    }

    private void zetVliegtuigType(VliegtuigType type) {

    }

    private LocalDate geefDatumInGebruik() {
        return datumInGebruik;
    }

    public void bewaar(){

    }
}
