package com.AntiguaDecorate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecorateTreesApp {

    public DecorateTreesApp() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecorateTree tree = new DecorateTree();
        System.out.println("Por favor ingrese el nombre del arbol a plantar: ");
        System.out.println("PINABETE");
        System.out.println("CHIRIBISCO");
        System.out.println("HOLLY");
        System.out.println("PINE");
        System.out.println("WHITE_CEDAR");
        String eleccion = br.readLine();
        tree.setTree(eleccion.toUpperCase());
        
        System.out.println("Desea agregar decoración?: SI/NO");
        String resp = br.readLine();
        
        if (resp.toUpperCase().equals("SI")) {
            do{
                System.out.println("Por favor ingrese el nombre del tipo de decoración: ");
                System.out.println("1. BOMBS");
                System.out.println("2. LIGHTS");
                System.out.println("3. SNOW");
                System.out.println("4. STARS");
                System.out.println("5. DOLLS");
                String dec = br.readLine();
                tree.addDecoration(dec.toUpperCase());
                System.out.println("Desea agregar otra decoración?: SI/NO");
                resp = br.readLine();    
            }while(resp.toUpperCase().equals("SI"));
            tree.decorateTree();
        }
        
        System.out.println("Gracias por participar!!!");

    }

}