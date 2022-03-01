package OOAD.college3;

import java.util.ArrayList;

public class LuchtvaartMaatschappij {
    private String naam;
    private ArrayList<Vliegtuig> vliegtuigen;

    public LuchtvaartMaatschappij(String nm) {
        this.naam = nm;
    }

    public void addVliegtuig(Vliegtuig vt) {
        vliegtuigen.add(vt);
    }

    public ArrayList<Vliegtuig> geefVliegtuigen() {
        return vliegtuigen;
    }
}
