package com.fredericboisguerin.insa.calculateurprix;

public enum Pays {

    BELGIQUE (1.21),
    DANEMARK (1.25),
    ALLEMAGNE (1.19),
    GRECE (1.23),
    ESPAGNE (1.21),
    FRANCE (1.2),
    IRLANDE (1.23),
    ITALIE (1.22),
    CHRYPE (1.19),
    LUXEMBOURG (1.15),
    PAYSBAS (1.21),
    AUTRICHE (1.2),
    PORTUGAL (1.23),
    SUEDE (1.25);

    private double tax;

    Pays(double s) {
        this.tax = s;
    }

    public double getTax(){
        return this.tax;
    }
}
