package OOAD.college3;

import java.util.ArrayList;

public class Fabrikant {
    private String naam;
    private static ArrayList<Fabrikant> alleFabrikanten;
    private static ArrayList<VliegtuigType> vliegtuigTypen;

    private static ArrayList<Fabrikant> geefAlle() {
        return alleFabrikanten;
    }

    public ArrayList<VliegtuigType> geefAlleVliegtuigTypen() {
        return vliegtuigTypen;
    }
}
