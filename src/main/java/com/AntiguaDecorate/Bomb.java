package com.AntiguaDecorate;

public class Bomb implements iDecoration {

    public Bomb() {
        this.manufacture();
    }

    public void manufacture() {
        System.out.println("Se está fabricando bombitas de colores...");
    }

    public String decorateTree() {
        return "bombitas de colores";
    }

}