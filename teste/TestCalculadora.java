import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//Se junit estiver a vermelho significa que deve adicionar junit 5 no classpath
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {
    //Versão 1

    Calculadora calculadora = new Calculadora();

    //Este é um exemplo para mostrar um teste a falhar, o resultado correto seria 3

    @Test
    void adicao() {
        assertEquals(2, calculadora.somar(1, 2));
    }

    //Versão 2: melhorada - código de teste mais organizado
    /*
    //Declaração das variáveis como private

    private int n1,n2;
    private double resultado;
    private Calculadora calculadora;

    @BeforeEach
    public void inicializa(){
    //antes de cada teste inicializa as variáveis
        calculadora = new Calculadora();
        n1 = 1;
        n2= 2;
    }

    @After
    public void finaliza(){
    //depois que os testes finalizarem, torna os valores das variàveis igual a zero
        n1=n2=0;
        resultado=0;
    }

    @Test
    void adicao() {
        resultado = 3;  //Valor correto esperado para a adição de 1 + 2
        assertEquals(resultado, calculadora.somar(n1, n2));
    }
   */
}
