package com.AntiguaDecorate;

import java.util.*;

/**
 * 
 */
public class Chiribisco implements ITree {

    
    public Chiribisco() {
        this.fell();
    }

    public void fell() {
        System.out.println("Se está cortando el árbol tipo Chiribisco...");
    }

    public void Place() {
        System.out.println("Se está colocando el árbol tipo Chiribisco...");
    }
}