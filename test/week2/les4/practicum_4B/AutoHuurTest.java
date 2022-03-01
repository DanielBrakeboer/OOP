package week2.les4.practicum_4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur ah;
    private Auto gA;
    private Klant k;

    @BeforeEach
    public void init(){
        System.out.println("init");
        ah = new AutoHuur();
    }

    @Test
    void geenHuurderOpgegeven() {
        assertEquals(ah.getHuurder(), null);
    }

    @Test
    void geenAutoOpgegeven() {
        assertEquals(ah.getGehuurdeAuto(), null);
    }


    @Test
    void geenHuurderWelAuto() {
        gA = new Auto("Peugeot 207", 150);
        ah.setGehuurdeAuto(gA);
        assertEquals(gA, ah.getGehuurdeAuto());

    }

    @Test
    void welHuurderGeenAuto() {
        k = new Klant("Daniel");
        ah.setHuurder(k);
        assertEquals(k, ah.getHuurder());
    }

}
