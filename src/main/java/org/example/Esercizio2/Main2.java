package org.example.Esercizio2;

import static java.lang.IO.println;

public class Main2 {
    public void main2(){
        int n=75; //difficoltà missione
        Reclutatore r;
        for (int i = 0; i < 5; i++) {
            println("Ciclo numero: "+(i+1));
            r = new Reclutatore();

            try{
                r.CheckEroe(n);
            }
            catch (EroeNonIdoneoException e){
                println(e.getMessage());
            }
        }
    }

}
