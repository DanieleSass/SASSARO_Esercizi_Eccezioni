package org.example.Esercizio1;

public class ContoBancario {
    private double saldo;
    public ContoBancario(double s){
        saldo = s;
    }

    public void preleva(double quantitaRichiesta) throws  SaldoInsufficienteException{

        if(quantitaRichiesta<=0){
            throw new ImportoNonValidoException("Importo è minore di 0, correggere");
        }

        double ris = saldo - quantitaRichiesta;


        if(ris<0){
            throw new SaldoInsufficienteException("Saldo insufficiente", saldo, quantitaRichiesta);
        }
        else{
            saldo = ris;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
