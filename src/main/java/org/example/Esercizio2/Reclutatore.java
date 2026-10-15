package org.example.Esercizio2;

import net.datafaker.Faker;

import java.util.Random;
import java.util.random.RandomGenerator;

import static java.lang.IO.println;

public class Reclutatore {
    int livello;
    String nome;

    public Reclutatore()
    {
        Faker f = new Faker();
        nome = f.name().fullName();
        livello = f.number().numberBetween(1,101);
    }

    public void CheckEroe(int n) throws EroeNonIdoneoException{
        if(livello<n){
            throw new EroeNonIdoneoException(nome, livello);
        }
        else{
            println("Eore supera la prova");
        }
    }

}
