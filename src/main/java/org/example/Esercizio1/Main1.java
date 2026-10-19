package org.example.Esercizio1;

import org.example.Esercizio1.ContoBancario;
import org.example.Esercizio1.ImportoNonValidoException;
import org.example.Esercizio1.SaldoInsufficienteException;

import static java.lang.IO.println;

public class Main1 {
    public void main1(){
        ContoBancario conto = new ContoBancario(1000);
        try{
            conto.preleva(30000);
        }
        catch (SaldoInsufficienteException e){
            println(e.getMessage());
            println("Differenza saldo-importo richiesto: " + (e.getSaldoAttuale()-e.getImportoRichiesto()));
        }
        finally{
            println("PRELIEVO ECCESSIVO -> BLOCCO FINALLY");
        }

        try{
            conto.preleva(-3);
        }
        catch (ImportoNonValidoException | SaldoInsufficienteException e){
            println(e.getMessage());
        }


        try{
            conto.preleva(40);
            println("Nuovo saldo:" + conto.getSaldo());
        } catch (Exception e) {
            println(e.getMessage());
        }
    }
}
