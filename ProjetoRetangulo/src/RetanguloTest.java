import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gabriel Land
 * @since 23:51 - 21/11/2021
 * @version 1.0
 */
class RetanguloTest {

    private Retangulo retangulo;

    /**
     * construtor vazio com instanciamento da classe retangulo
     */
    public RetanguloTest() {
        retangulo = new Retangulo();
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        retangulo.setLado1(10);
        retangulo.setLado2(2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        retangulo.setLado1(10);
        retangulo.setLado2(2);
    }

    @org.junit.jupiter.api.Test
    void getLado1() {
        assertEquals(10, retangulo.getLado1());
    }

    @org.junit.jupiter.api.Test
    void getLado2() {
        assertEquals(2, retangulo.getLado2());
    }

    @org.junit.jupiter.api.Test
    void calcularAreaDoRetangulo() {
        assertEquals(20, retangulo.calcularAreaDoRetangulo(), 0.5);
    }

    @org.junit.jupiter.api.Test
    void calcularPerimetroDoRetangulo() {
        assertEquals(24, retangulo.calcularPerimetroDoRetangulo(), 0.5);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("\nlado 1: " + retangulo.getLado1() +
                    "\nlado 2: " + retangulo.getLado2() +
                    "\nArea: " + retangulo.calcularAreaDoRetangulo() +
                    "\nPerimetro: " + retangulo.calcularPerimetroDoRetangulo(), retangulo.toString());
    }
}