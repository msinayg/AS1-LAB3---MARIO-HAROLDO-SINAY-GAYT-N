package com.AntiguaDecorate;

import java.util.*;

/**
 * 
 */
public class Doll implements iDecoration {

    public Doll() {
        this.manufacture();
    }

    public void manufacture() {
        System.out.println("Se está fabricando muñequitos...");
    }

    public String decorateTree() {
        return "muñequitos";
    }

}