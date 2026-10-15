package org.example.Esercizio1;

public class SaldoInsufficienteException extends Exception {
    double saldoAttuale;
    double importoRichiesto;
    public SaldoInsufficienteException(String message) {
        super(message);
    }
    public SaldoInsufficienteException(String message, double saldoAttuale, double importoRichiesto){
        super(message);
        this.saldoAttuale=saldoAttuale;
        this.importoRichiesto =importoRichiesto;
    }

    public double getImportoRichiesto(){
        return importoRichiesto;
    }

    public double getSaldoAttuale() {
        return saldoAttuale;
    }
}
