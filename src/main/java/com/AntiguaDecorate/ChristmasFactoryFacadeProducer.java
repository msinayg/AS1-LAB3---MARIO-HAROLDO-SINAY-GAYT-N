package com.AntiguaDecorate;


public class ChristmasFactoryFacadeProducer {

    public ChristmasFactoryFacadeProducer() {
    }

    public TreeFactory getTreeFactory() {
        return new TreeFactory();
    }

    public DecorationFactory getDecorationFactory() {
        return new DecorationFactory();
    }

}