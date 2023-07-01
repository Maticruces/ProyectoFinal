package Test;
import code.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase AsientoVIP.
 */
public class AsientoVIPTest {
    private AsientoVIP asientoVIP;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        asientoVIP = new AsientoVIP(300);
    }

    /**
     * Prueba para obtener el precio del asiento VIP.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(300, asientoVIP.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento VIP.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento VIP", asientoVIP.getTipo());
    }
}
