module A {
    //modolul A declara ce are nevoie de modulul java.base
    requires java.base;

    //expunem toate clasele publice din pachetul service
    exports service;


}