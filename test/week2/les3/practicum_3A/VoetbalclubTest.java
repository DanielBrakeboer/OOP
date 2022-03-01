package week2.les3.practicum_3A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub voetbalclub;

    @BeforeEach
    void init() {
        voetbalclub = new Voetbalclub("Check");
        System.out.println("init");
    }

    // Eis: als de clubnaam null of leeg ("") is, moet de naam "FC" gebruikt worden.

    @Test
    void nullIngevuldAlsNaamVoetbalclub() {
        voetbalclub.setNaam(null);
        assertEquals(null, voetbalclub);
    }

    @Test
    void legeStringIngevuldAlsNaamVoetbalclub() {
        voetbalclub.setNaam("");
        assertEquals("", voetbalclub);
    }

    // het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op.
    // Foutieve invoer mag het puntensaldo en totaalaantal gespeelde wedstrijden niet beïnvloeden!

    @Test
    void totaalAantalPuntenCheckInclusiefFoutieveInvoer() {
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('f');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        assertEquals(8, voetbalclub.aantalPunten());
    }

    @Test
    void aantalGespeeldeWedstrijdenCheckInclusiefFoutieveInvoer() {
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('f');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        assertEquals(4, voetbalclub.aantalGespeeld());
    }

    //Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op, en is zichtbaar in de stringrepresentatie van de toString-methode.

    @Test
    void aanwezigheidResultatenInStringRepresentatie() {
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('f');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        assertEquals("Check 4 2 2 0 8", voetbalclub);
    }

}