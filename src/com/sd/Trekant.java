package com.sd;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;

public class Trekant extends Shape{

    //Opret doubles til at holde alle koordinator enkeltvis
    double AX;
    double AY;

    double BX;
    double BY;

    double CX;
    double CY;

    double midtX;
    double midtY;

    double højX;
    double lavX;
    double højY;
    double lavY;

    double breddeX;
    double højdeY;

    double andenAX;
    double andenAY;

    double andenBX;
    double andenBY;

    double andenCX;
    double andenCY;

    double pX;
    double pY;
    boolean erDetInde;

    double midtPX;
    double midtPY;

    //Constructor for en enkelt trekant
    public Trekant(double AX, double AY, double BX, double BY, double CX, double CY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
    }

    //constructor for en trekant og et punkt
    public Trekant(double AX, double AY, double BX, double BY, double CX, double CY, double pX, double pY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.pX = pX;
        this.pY = pY;
    }

    //constructor for 2 trekanter


    public Trekant(double AX, double AY, double BX, double BY, double CX, double CY, double andenAX, double andenAY,
                   double andenBX, double andenBY, double andenCX, double andenCY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.andenAX = andenAX;
        this.andenAY = andenAY;
        this.andenBX = andenBX;
        this.andenBY = andenBY;
        this.andenCX = andenCX;
        this.andenCY = andenCY;
    }

    Point2D.Double findMidterpunkt() {
        //For at finde midten, eller det geometriske tyngdepunkt, af trekanten
        // har jeg brugt formlen fra denne side:
        // https://study.com/academy/lesson/how-to-find-the-centroid-of-a-triangle.html
        midtPX = (AX + BX + CX)/3;
        midtPY = (AY + BY + CY)/3;
        Point2D.Double midtPunkt = new Point2D.Double(midtPX, midtPY);

        return midtPunkt;
    }

    double findAreal() {
        double areal;

        //Jeg putter koordinatorne i arrays og sorterer dem således jeg kan finde
        //højeste X og højeste Y, for at få højden og bredden på trekanten
        double[] Xkor = {AX, BX, CX};
        double[] Ykor = {AY, BY, CY};

        Arrays.sort(Xkor); //Sorter X koordinaterrne, så vi kan udplukke den højeste og laveste
        højX = Xkor[2];
        lavX = Xkor[0];

        Arrays.sort(Ykor);
        højY = Ykor[2];
        lavY = Ykor[0];

        //find højde
        højdeY = højY-lavY;
        //find bredde
        breddeX = højX-lavX;
        //find areal
        areal = (breddeX * højdeY)/2;

        return areal;
    }

    double findOmkreds() {
        //jeg vil bruge distance til at finde længden af alle sider, for til sidst at
        //lægge dem sammen. Derfor laver jeg points for hjørnerne

        Point A = new Point(AX, AY);
        Point B = new Point(BX, BY);
        Point C = new Point(CX, CY);

        return 0;
    }

    boolean erPunktetIndeIFormen() {
        return false;
    }

    double afstandMellemFormer() {
        return 0;
    }
}
