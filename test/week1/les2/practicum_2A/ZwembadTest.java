package week1.les2.practicum_2A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    private Zwembad z;

    @BeforeEach
    public void init(){
        System.out.println("init");
        z = new Zwembad(15, 5, 20);
    }

    @Test
    void testBerekendeInhoud() {
        System.out.println("testBerekendeInhoud");
        assertEquals(1400, z.inhoud(), "De inhoud klopt niet");
    }

}