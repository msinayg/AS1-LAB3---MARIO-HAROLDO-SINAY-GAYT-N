package com.AntiguaDecorate;

public class SyntheticSnow implements iDecoration {

    public SyntheticSnow() {
        this.manufacture();
    }

    public void manufacture() {
        System.out.println("Se está fabricando nieve sintética...");
    }

    public String decorateTree() {
        return "nieve sintética";
    }

}