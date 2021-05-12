package com.AntiguaDecorate;

public class WhiteCedar implements ITree {

    public WhiteCedar() {
        this.fell();
    }

    public void fell() {
        System.out.println("Se está cortando el árbol tipo Cedro Blanco...");
    }

    public void Place() {
        System.out.println("Se está colocando el árbol tipo Cedro Blanco...");
    }

}