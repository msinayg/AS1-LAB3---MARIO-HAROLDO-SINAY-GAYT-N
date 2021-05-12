package com.AntiguaDecorate;
public class PlaceTree {

    
    public PlaceTree() {
        factory = new ChristmasFactoryFacadeProducer();
    }

    protected ITree cutTree;
    protected ChristmasFactoryFacadeProducer factory;
   
    
    public ITree getTree(){
        return this.cutTree;
    }
    
    public void setTree(String str) {
        cutTree = factory.getTreeFactory().getTree(str);
    }
    

}