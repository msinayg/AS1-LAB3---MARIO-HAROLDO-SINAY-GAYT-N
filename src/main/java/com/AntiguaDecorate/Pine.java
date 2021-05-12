package com.AntiguaDecorate;

public class Pine implements ITree {

    public Pine() {
        this.fell();
    }

    public void fell() {
        System.out.println("Se está cortando el árbol tipo Pino...");
    }

    public void Place() {
        System.out.println("Se está colocando el árbol tipo Pino...");
    }

}