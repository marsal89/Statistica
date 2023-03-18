package com.company;

public class Dato {
    private String cognome;
    private String nome;
    private float altezza;

    Dato(String cognome,String nome,float altezza) {
        this.cognome = cognome;
        this.nome = nome;
        this.altezza = altezza;
    }

    public String getCognome(String cognome){

        return cognome;
    }

    public String getNome(String nome){
        return nome;
    }
    public float getAltezza(float altezza){

        return altezza;
    }

    public float getAltezza() {
        return this.altezza=altezza;
    }
}
