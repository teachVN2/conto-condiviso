package com.example;
public class Conto {
 
    private final String intestatario;
    private double saldo;
 
    public Conto(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
 
    // ISSUE #1 -> da implementare: versa(double importo)
    // ISSUE #2 -> da implementare: preleva(double importo)
    public void preleva(double importo) {
        if (importo <= 0) {
            throw new IllegalArgumentException("Importo non valido");
        }
        if (importo <= saldo) {
            saldo -= importo;
        } else {
            throw new IllegalArgumentException("Saldo insufficiente");
        }
    }
 
    public double getSaldo() {
        return saldo;
    }
}
