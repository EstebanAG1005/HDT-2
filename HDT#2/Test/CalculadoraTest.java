import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void calculo() {
        Calculadora test = new Calculadora();

        String expresion = "9/3";
        int respuesta = Integer.parseInt(test.calculo(expresion));

        assertEquals(3, respuesta);
    }
}