package com.AntiguaDecorate;

public class Light implements iDecoration {

    public Light() {
        this.manufacture();
    }

    public void manufacture() {
        System.out.println("Se está fabricando luces de colores...");
    }

    public String decorateTree() {
        return "luces de colores";
    }

}