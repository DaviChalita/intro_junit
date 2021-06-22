package calculadora;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void inicializa() {
        calc = new Calculadora();
    }

    @DisplayName("Testa a soma de dois n�meros")
    @Test
    public void testSomaDoisNumeros() {
        int soma = calc.soma(4, 5);
        Assertions.assertEquals(9, soma);
    }

    @DisplayName("Teste a subtração entre dois números")
    @Test
    public void testSubDoisNumeros() {
        int subtracao = calc.subtracao(6, 4);
        Assertions.assertEquals(2, subtracao);
    }

    @Test
    public void testMultDoisNumeros() {
        int multiplicacao = calc.multiplicacao(10, 3);
        Assertions.assertEquals(30, multiplicacao);
    }

    @Test
    public void testDivisaoDoisNumeros() {
        int divisao = calc.divisao(8, 4);
        assertTrue(divisao == 2);
    }

    @Test
    public void testDivisaoPorZero() {
        try {
            int divisao = calc.divisao(8, 0);
            fail("Exce��o n�o lan�ada");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }

    @Test
    public void testDivisaoPorZeroComAssertThrows() {
        assertThrows(ArithmeticException.class,
                () -> calc.divisao(8, 0));
    }

    @Test
    public void testSomatoria() {
        int somatoria = calc.somatoria(10);
        Assertions.assertEquals(55, somatoria);
    }

    @Test
    public void testPositivo() {
        boolean ehPositivo = calc.ehPositivo(3);
        Assertions.assertEquals(true, ehPositivo);
    }

    @Test
    public void testCompara() {
        int compara1 = calc.compara(3, 5);
        Assertions.assertEquals(-1, compara1);
        int compara2 = calc.compara(4, 4);
        Assertions.assertEquals(0, compara2);
        int compara3 = calc.compara(5, 3);
        Assertions.assertEquals(1, compara3);
    }

}
