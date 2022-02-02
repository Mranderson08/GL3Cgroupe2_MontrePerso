package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MontreTest {
    Personne P = new Personne("Amos");
    Montre m = new Montre(9,25);

    @Test
    void testAvance() {
        P.porteMontre(m);
        assertNotNull(P.Pmontre);
    }
}