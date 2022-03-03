package com.sd;

import java.awt.geom.Point2D;

public class Cirkel extends Shape {

    double X;
    double Y;
    double r; //radus for den første cirkel
    double pX;
    double pY;
    double andenX;
    double andenY;
    double andenR; //radius for den anden cirkel
    double pi = Math.PI;

    //Cirkel
    public Cirkel(double X, double Y, double r) {
        this.X = X;
        this.Y = Y;
        this.r = r;
    }

    //cirkel og punkt
    public Cirkel(double X, double Y, double r, double pX, double pY) {
        this.X = X;
        this.Y = Y;
        this.r = r;
        this.pX = pX;
        this.pY = pY;
    }

    //to cirkler
    public Cirkel(double X, double Y, double r, double andenX, double andenY, double andenR) {
        this.X = X;
        this.Y = Y;
        this.r = r;
        this.andenX = andenX;
        this.andenY = andenY;
        this.andenR = andenR;
    }

    Point2D.Double findMidterpunkt() {

        //Midterpunktet er blot det originale indtastede koordinat
        Point2D.Double midterPunkt = new Point2D.Double(X, Y);

        return midterPunkt;
    }

    double findAreal() {
        double areal;
        //vi bruger formlen her fra: http://faa12.dk/studietips/saadan-finder-du-arealet-cirkel/
        areal = pi*r*r;

        return areal;
    }

    double findOmkreds() {
        double omkreds;
        //vi bruger formlen her fra: https://www.hvordan.dk/hvordan-finder-man-omkredsen-af-en-cirkel
        omkreds = pi*2*r;

        return omkreds;
    }

    boolean erPunktetIndeIFormen() {
        //For at finde ud af om punktet er inde i cirklen, tjekker jeg om afstanden mellem det eksterne punkt
        // og midterpunktet af cirklen er mindre end radius

        boolean erDetInde = false;

        //find afstand mellem midterpunkt til givet punkt
        Point2D.Double midterPunkt = new Point2D.Double(X, Y);
        Point2D.Double  eksternPunkt = new Point2D.Double(pX, pY);
        double afstand = midterPunkt.distance(eksternPunkt);

        if (afstand <= r) {
            erDetInde = true;
        }

        return erDetInde;
    }

    double afstandMellemFormer() {
        //jeg vil først skabe 2 Point2D.Double, så jeg kan bruge distance til at finde afstanden
        Point2D.Double cirkel1 = new Point2D.Double(X, Y);
        Point2D.Double  cirkel2 = new Point2D.Double(andenX, andenY);
        double afstand = cirkel1.distance(cirkel2);

        return afstand;
    }
}
