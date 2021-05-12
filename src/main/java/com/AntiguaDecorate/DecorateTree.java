package com.AntiguaDecorate;

import java.util.ArrayList;

public class DecorateTree extends PlaceTree {

    public DecorateTree() {
        decoration = new ArrayList<iDecoration>();
    }

    private ArrayList<iDecoration> decoration;
    
    public void addDecoration(String der){
        this.decoration.add(this.factory.getDecorationFactory().setDecoration(der));
    }
    
    public String getIndexDecoration(int i) {
        return this.decoration.get(i).decorateTree() + ", ";
    }

    
    public void decorateTree() {
        if (this.cutTree instanceof Chiribisco){
            System.out.print("Se está decorando el chiribisco con: ");
        } else if(this.cutTree instanceof Holly) {
            System.out.print("Se está decorando el acebo con: ");
        } else if(this.cutTree instanceof Pinabete) {
            System.out.print("Se está decorando el pinabete con: ");
        } else if(this.cutTree instanceof Pine) {
            System.out.print("Se está decorando el pino con: ");
        } else if(this.cutTree instanceof WhiteCedar) {
            System.out.print("Se está decorando el cedro blanco con: ");
        }
        for (int i = 0; i < this.decoration.size(); i++) {
            System.out.print(this.getIndexDecoration(i));
        }
    }

}