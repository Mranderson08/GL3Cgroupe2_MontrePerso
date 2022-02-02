package mypackage;

import org.junit.Test;

import static org.junit.Assert.*;

class MontreTest{
    @Test
    void avance() {

    }
    @Test
    void ajoutMontrePorter() {

    }
    @Test
    void estPorter() {

    }
    @Test
    void main() {
        Montre montre = new Montre(9, 25);
        Montre clone = new Montre(montre);
        assertNotNull(montre);
        assertNotNull(clone);
    }
}