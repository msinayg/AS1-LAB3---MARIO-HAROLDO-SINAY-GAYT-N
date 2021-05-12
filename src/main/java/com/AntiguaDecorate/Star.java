package com.AntiguaDecorate;

public class Star implements iDecoration {

    public Star() {
        this.manufacture();
    }

    public void manufacture() {
        System.out.println("Se está fabricando estrellas...");
    }

    public String decorateTree() {
        return "estrellas";
    }

}