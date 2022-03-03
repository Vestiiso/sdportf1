package com.sd;

import java.awt.*;
import java.awt.geom.Path2D;
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

    double andenMidtPX;
    double andenMidtPY;

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
        //lægge dem sammen. Derfor laver vi points for hjørnerne
        double omkreds;
        double AB;
        double BC;
        double CA;

        //points til hvert hjørne i trekanten
        Point2D.Double A = new Point2D.Double(AX, AY);
        Point2D.Double B = new Point2D.Double(BX, BY);
        Point2D.Double C = new Point2D.Double(CX, CY);

        //Find længden af hver side
        AB = A.distance(B);
        BC = B.distance(C);
        CA = C.distance(A);

        //læg siderne sammen for at få omkredsen
        omkreds = AB + BC + CA;

        return omkreds;
    }

    boolean erPunktetIndeIFormen() {
        //Her bruger vi Path2D.Double for at kunne bruge contains.
        boolean punktetErInde;

        Path2D.Double trekanten = new Path2D.Double(); //opretter en ny path
        trekanten.moveTo(AX, AY);                //opretter første punkt ved A
        trekanten.lineTo(BX, BY);                //opretter en linje til B
        trekanten.lineTo(CX, CY);                //opretter en linje fra B til C
        trekanten.closePath();                   //opretter en linje tilbage til startpunktet ved A
        erDetInde = trekanten.contains(pX, pY);  //tjekker om punktet er inde i trekanten

        return erDetInde;
    }

    double afstandMellemFormer() {
        double afstand;

        //først finder vi midterpunktet for den første trekant
        midtPX = (AX + BX + CX)/3;
        midtPY = (AY + BY + CY)/3;
        Point2D.Double midtPunkt = new Point2D.Double(midtPX, midtPY);

        //så finder vi midterpunktet for den anden trekant
        andenMidtPX = (andenAX + andenBX + andenCX)/3;
        andenMidtPY = (andenAY + andenBY + andenCY)/3;
        Point2D.Double andenMidtPunkt = new Point2D.Double(andenMidtPX, andenMidtPY);

        //Så bruger vi distance til at finde afstanden mellem dem
        afstand = midtPunkt.distance(andenMidtPunkt);

        return afstand;
    }
}
