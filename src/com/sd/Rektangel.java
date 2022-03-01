package com.sd;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Rektangel extends Shape {

    //Vi har brugt ints til koordinatorne for at gøre programmet mere
    //simpelt, men de kan nemt laves om til doubles hvis man ønsker
    //decimaler i sine koordinator

    //Opret ints til at holde alle koordinator enkeltvis

    int AX;
    int AY;

    int BX;
    int BY;

    int CX;
    int CY;

    int DX;
    int DY;

    //Opret 2 arrays der holder henholdsvis x og y koordinator,
    //så de nemt kan sammenlignes
    int[] Xkor = {AX, BX, CX, DX};
    int[] Ykor = {AY, BY, CY, DY};

    //Constructor der tager imod koordinator og placerer dem i deres ints
    public Rektangel(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
    }


    Point findMidterpunkt() { //er en string for at vi nemmest kan give begge ints på samme tid
        //ret evt. til "Point" typen senere
        int højX;
        int lavX;

        int midtX = 0;
        int midtY = 0;

        //Sorter x koordinatorne, så vi kan udplukke den højeste og laveste
        Arrays.sort(Xkor);
        højX = Xkor[3];
        lavX = Xkor[0];
        midtX = Xkor[0];  //der er gået noget galt her

        //Lav et punkt ud fra x og y koorndinatet og return det
        Point midtPunkt = new Point(midtX, midtY);
        return midtPunkt;
    }

    double findAreal() {
        //find højde
        //find bredde
        //

        return 0;
    }

    double findOmkreds() {
        return 0;
    }

    boolean erPunktetIndeIFormen() {
        return false;
    }

    double afstandMellemFormer() {
        return 0;
    }
}
