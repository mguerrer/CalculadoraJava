package cl.calculadora.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class CoreUnitTests {
    /**
     * Pruebas unitarias clase core.
     */
    Core calculadora = new Core();

    @Test
    void testSuma() {
        final double z = calculadora.Suma(1, 2);
        assertEquals(z, 3.0);
    }    
    @Test
    void testResta() {
        final double z = calculadora.Resta(1, 2);
        assertEquals(z, -1.0);
    }    
    @Test
    void testMultiplica() {
        final double z = calculadora.Multiplica(10, 2);
        assertEquals(z, 20.0);
    }    
    @Test
    void testDivideNormal() {
        final double z = calculadora.Divide(10, 2);
        assertEquals(z, 5.0);
    }    
    @Test
    void testDividePorCero() {
        final double z = calculadora.Divide(10, 0);
        assertEquals(z, Double.POSITIVE_INFINITY);
    }    
}
