public class Conto {
 
    private final String intestatario;
    private double saldo;
 
    public Conto(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
 
    // ISSUE #1 -> da implementare: versa(double importo)
    // ISSUE #2 -> da implementare: preleva(double importo)
 
    public double getSaldo() {
        return saldo;
    }
}
