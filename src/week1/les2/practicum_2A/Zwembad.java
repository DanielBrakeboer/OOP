package week1.les2.practicum_2A;

public class Zwembad {
        private double breedte;
        private double lengte;
        private double diepte;


    public Zwembad(double br, double len, double dep) {
        this.breedte = br;
        this.lengte = len;
        this.diepte = dep;
    }

    public Zwembad(){
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double br) {
        this.breedte = br;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double len) {
        this.lengte = len;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double dep) {
        this.diepte = dep;
    }

    public double inhoud() {
        return (breedte * lengte * diepte);
    }

    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
    }
}
