package com.sd;

import java.awt.geom.Point2D;

public abstract class Shape {

    //return midterpunktet på formen
    //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
    abstract Point2D.Double findMidterpunkt();

    //udregn arealet af formen
    abstract double findAreal();

    //udregn omkredsen af formen
    abstract double findOmkreds();

    //indikere om et punkt er inden for formen eller ej
    abstract boolean erPunktetIndeIFormen();

    //udregn afstanden mellem midterpunkterne på to former
    abstract double afstandMellemFormer();
}
