package com.AntiguaDecorate;

public class Pinabete implements ITree {

    public Pinabete() {
        this.fell();
    }

    public void fell() {
        System.out.println("Se está cortando el árbol tipo Pinabete...");
    }

    public void Place() {
        System.out.println("Se está colocando el árbol tipo Pinabete...");
    }

}