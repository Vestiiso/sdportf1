package com.sd;

import java.awt.geom.Point2D;

public abstract class Shape {



    //Shape();
    //måske kan jeg ikke have en constructor i den abstrakte class?

    //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
    abstract Point2D.Double findMidterpunkt();
    //bare send en string der siger "midterpunktet er: " +x "," +y

    abstract double findAreal();

    abstract double findOmkreds();

    abstract boolean erPunktetIndeIFormen();

    abstract double afstandMellemFormer();
}
