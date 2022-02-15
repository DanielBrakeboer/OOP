package week2.les3.practicum_3A;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
        if (nm == null || nm == "") {
            this.naam = "FC";
        }
        else {
            this.naam = nm;
        }
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam(){
        return naam;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        else
            System.out.println("Foutieve ingave");
    }

    public int aantalPunten() {
        return getAantalGelijk() + (getAantalGewonnen() * 3);
    }

    public int aantalGespeeld() {
        return getAantalGelijk() + getAantalGewonnen() + getAantalVerloren();
    }

    public String toString() {
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
