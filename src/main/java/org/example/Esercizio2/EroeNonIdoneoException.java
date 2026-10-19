package org.example.Esercizio2;

public class EroeNonIdoneoException extends Exception {
    String nomeEroe;
    int livello;
    public EroeNonIdoneoException(String message)
    {
        super(message);
    }

    public EroeNonIdoneoException(String er, int lvl){
        super ("Eroe: " + er + " - livello: "+ lvl+" non supera missione");
        nomeEroe=er;
        livello=lvl;
    }

    public int getLivello() {
        return livello;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

}
