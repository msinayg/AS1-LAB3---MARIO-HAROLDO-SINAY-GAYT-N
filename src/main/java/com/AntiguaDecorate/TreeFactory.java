package com.AntiguaDecorate;

public class TreeFactory {

    public TreeFactory() {
    }

    public ITree getTree(String TreeType) {
        switch(TreeType){
            case "PINABETE":
                ITree pinabete;
                return pinabete = new Pinabete();
            case "CHIRIBISCO":
                ITree chiribisco;
                return chiribisco = new Chiribisco();
            case "HOLLY":
                ITree holly;
                return holly = new Holly();
            case "WHITE_CEDAR":
                ITree whiteCedar;
                return whiteCedar = new WhiteCedar();
            case "PINE":
                ITree pine;
                return pine = new Pine();
            default:
                System.out.println("Error... el tipo de árbol no está disponible...");
                break;
        }
        return null;
    }

}