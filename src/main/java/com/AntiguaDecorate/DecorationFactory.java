package com.AntiguaDecorate;

import java.util.ArrayList;

public class DecorationFactory {

    public DecorationFactory() {
        
    }

    public iDecoration setDecoration(String DecorationType) {
        switch(DecorationType){
            case "BOMBS":
                return new Bomb();
            case "LIGHTS":
                return new Light();
            case "SNOW":
                return new SyntheticSnow();
            case "STARS":
                return new Star();
            case "DOLLS":
                return new Doll();
            default:
                System.out.println("Error... elija otra decoración");
                break;
        }
        return null;
    }

}