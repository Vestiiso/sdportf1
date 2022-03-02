package com.sd;

import java.awt.geom.Point2D;
import java.util.Arrays;

import static java.awt.geom.Point2D.distance;

public class Rektangel extends Shape {

    //Opret doubles til at holde alle koordinator enkeltvis
    double AX;
    double AY;

    double BX;
    double BY;

    double CX;
    double CY;

    double DX;
    double DY;

    double andenAX;
    double andenAY;

    double andenBX;
    double andenBY;

    double andenCX;
    double andenCY;

    double andenDX;
    double andenDY;

    double pX;
    double pY;
    boolean erDetInde;

    double højX;
    double lavX;
    double højY;
    double lavY;

    double længdeX;
    double længdeY;

    double midtX;
    double midtY;

    double andenHøjX;
    double andenLavX;
    double andenHøjY;
    double andenLavY;

    double andenLængdeX;
    double andenLængdeY;

    double andenMidtX;
    double andenMidtY;

    //Vi bruger overloaded constructors så man f.eks. ikke behøver at indtaste koordinator for 2 rektangler, hvis man bare vil have
    //arealet af ét
    //Constructors der tager imod koordinator og placerer dem i deres doubles:

    //rektangel constructor
    public Rektangel(double AX, double AY, double BX, double BY, double CX, double CY, double DX, double DY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
    }

    //rektangel + punkt constructor
    public Rektangel(double AX, double AY, double BX, double BY, double CX, double CY, double DX, double DY, double pX, double pY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
        this.pX = pX;
        this.pY = pY;
    }

    //2 rektangler constructor
    public Rektangel(double AX, double AY, double BX, double BY, double CX, double CY, double DX, double DY,
                     double andenAX, double andenAY, double andenBX, double andenBY, double andenCX, double andenCY,
                     double andenDX, double andenDY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
        this.pX = pX;
        this.pY = pY;
        this.andenAX = andenAX;
        this.andenAY = andenAY;
        this.andenBX = andenBX;
        this.andenBY = andenBY;
        this.andenCX = andenCX;
        this.andenCY = andenCY;
        this.andenDX = andenDX;
        this.andenDY = andenDY;
    }

    //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
    Point2D.Double findMidterpunkt() {
        //Opret 2 arrays der holder henholdsvis X og Y koordinator,
        //så de nemt kan sammenlignes
        double[] Xkor = {AX, BX, CX, DX};
        double[] Ykor = {AY, BY, CY, DY};

        //Find ud af hvor lange de horisontale og vertikale sider er (virker kun i et rektangel fordi alle vinkler
        // er 90 grader) og find herefter ud af hvor langt der er til midtpunktet af
        Arrays.sort(Xkor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        højX = Xkor[3];
        lavX = Xkor[0];
        midtX = (højX-lavX)/2;

        Arrays.sort(Ykor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        højY = Ykor[3];
        lavY = Ykor[0];
        midtY = (højY-lavY)/2;

        //Lav et punkt ud fra X og Y koorndinatet og return det
        //Vi pludser længden til midtpunktet med det laveste koordinat, så vi får midtpunktets koordinat
        //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
        Point2D.Double midtPunkt = new Point2D.Double(midtX+lavX, midtY+lavY);
        return midtPunkt;
    }

    double findAreal() {
        double areal;
        //find højde
        længdeY = højY-lavY;
        //find bredde
        længdeX = højX-lavX;
        //find areal
        areal = længdeX*længdeY;
        return areal;
    }

    double findOmkreds() {
        //find højde
        længdeY = højY-lavY;
        //find bredde
        længdeX = højX-lavX;
        double omkreds = (længdeX*2)+(længdeY*2);
        return omkreds;
    }

    boolean erPunktetIndeIFormen() {
        if (pX>lavX && pY>lavY && pX<højX && pY<højY) {
            erDetInde = true;
        }
        return erDetInde;
    }

    double afstandMellemFormer() {
        // *** find midterpunkt for rektangel og opret et point2D.double med koordinatorne ***

        //Opret 2 arrays der holder henholdsvis X og Y koordinator,
        //så de nemt kan sammenlignes
        double[] Xkor = {AX, BX, CX, DX};
        double[] Ykor = {AY, BY, CY, DY};

        //Find ud af hvor lange de horisontale og vertikale sider er (virker kun i et rektangel fordi alle vinkler
        // er 90 grader) og find herefter ud af hvor langt der er til midtpunktet af
        Arrays.sort(Xkor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        højX = Xkor[3];
        lavX = Xkor[0];
        midtX = (højX-lavX)/2;

        Arrays.sort(Ykor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        højY = Ykor[3];
        lavY = Ykor[0];
        midtY = (højY-lavY)/2;

        //Lav et punkt ud fra X og Y koorndinatet og return det
        //Vi pludser længden til midtpunktet med det laveste koordinat, så vi får midtpunktets koordinat
        //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
        Point2D.Double midtPunkt = new Point2D.Double(midtX+lavX, midtY+lavY);
        System.out.println("midtpunktet1 er: " + midtPunkt);

        // *** find midterpunkt for rektangel 2 og opret et point2D.double med koordinatorne ***
        //Opret 2 arrays der holder henholdsvis X og Y koordinator,
        //så de nemt kan sammenlignes
        double[] andenXkor = {andenAX, andenBX, andenCX, andenDX};
        double[] andenYkor = {andenAY, andenBY, andenCY, andenDY};

        //Find ud af hvor lange de horisontale og vertikale sider er (virker kun i et rektangel fordi alle vinkler
        // er 90 grader) og find herefter ud af hvor langt der er til midtpunktet af
        Arrays.sort(andenXkor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        andenHøjX = andenXkor[3];
        andenLavX = andenXkor[0];
        andenMidtX = (andenHøjX-andenLavX)/2;

        Arrays.sort(andenYkor); //Sorter Y koordinatorne, så vi kan udplukke den højeste og laveste
        andenHøjY = andenYkor[3];
        andenLavY = andenYkor[0];
        andenMidtY = (andenHøjY-andenLavY)/2;

        //Lav et punkt ud fra X og Y koorndinatet og return det
        //Vi pludser længden til midtpunktet med det laveste koordinat, så vi får midtpunktets koordinat
        //Point2D.Double er ligesom et point altså to koordinator, men koordinatorne kan være doubles ikke kun ints
        Point2D.Double andenMidtPunkt = new Point2D.Double(andenMidtX+andenLavX, andenMidtY+andenLavY);
        System.out.println("midtpunktet2 er: " + andenMidtPunkt);

        // *** brug Distance til at finde afstanden mellem dem ***

        double afstand = midtPunkt.distance(andenMidtPunkt.getX(), andenMidtPunkt.getY());

        return afstand;
    }
}
