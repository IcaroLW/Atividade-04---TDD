import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcular(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcular(1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test
    public void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcular(10));
    }

    @Test
    public void testNumeroNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> Fatorial.calcular(-1));
    }
}
