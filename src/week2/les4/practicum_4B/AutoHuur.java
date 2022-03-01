package week2.les4.practicum_4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        return (getGehuurdeAuto().getPrijsPerDag() * getAantalDagen()) - (getGehuurdeAuto().getPrijsPerDag() * getAantalDagen()) * (getHuurder().getKorting() / 100);
    }

    public String toString() {
        String out = "";
        if (gehuurdeAuto == null) {
            out += "er is geen auto bekend";
            if (huurder == null) {
                out += "\ner is geen huurder bekend";
            }
            if (huurder != null) {
                out += "\n" + getHuurder();
            }
            if (gehuurdeAuto == null || huurder == null) {
                out += "\naantal dagen: 0 en dat kost 0.0";
            }
        } else if (gehuurdeAuto != null) {
            out += getGehuurdeAuto();
            if (huurder == null) {
                out += "\ner is geen huurder bekend";
            }
            if (huurder != null) {
                out += "\n" + getHuurder();
            }
            if (gehuurdeAuto == null || huurder == null) {
                out += "\naantal dagen: 0 en dat kost 0.0";
            } else {
                out += "\naantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
            }
        }
        return out;
    }

}
