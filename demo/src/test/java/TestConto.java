import org.junit.jupiter.api.Test;

import com.example.Conto;

public class TestConto {
    @Test 
    public void testPreleva() {
        Conto conto = new Conto("Mario Rossi", 1000.0);
        conto.preleva(500.0);
        assert conto.getSaldo() == 500.0;      
    }

    @Test 
    public void testPrelevaInsufficiente() {
        Conto conto = new Conto("Mario Rossi", 1000.0);
        try {
            conto.preleva(1500.0);
            assert false; // Se arriva qui, il test fallisce
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Saldo insufficiente");
        }
    }

    @Test 
    public void testPrelevaEsatto() {
        Conto conto = new Conto("Mario Rossi", 1000.0);
        conto.preleva(1000.0);
        assert conto.getSaldo() == 0.0;      
    }

    @Test 
    public void testPrelevaNegativo() {
        Conto conto = new Conto("Mario Rossi", 1000.0);
        try {
            conto.preleva(-100.0);
            assert false; // Se arriva qui, il test fallisce
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Importo non valido");
        }
    }
}
