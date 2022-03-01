package com.sd;

import java.util.ArrayList;

public abstract class Shape {



    //Shape();
    //måske kan jeg ikke have en constructor i den abstrakte class?

    abstract String findMidterpunkt();
    //bare send en string der siger "midterpunktet er: " +x "," +y

    abstract double findAreal();

    abstract double findOmkreds();

    abstract boolean erPunktetIndeIFormen();

    abstract double afstandMellemFormer();
}
