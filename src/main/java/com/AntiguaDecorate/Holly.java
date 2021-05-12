package com.AntiguaDecorate;


public class Holly implements ITree {

    public Holly() {
        this.fell();
    }

    public void fell() {
        System.out.println("Se está cortando el árbol tipo Holly...");
    }

    public void Place() {
        System.out.println("Se está colocando el árbol tipo Holly...");
    }

}