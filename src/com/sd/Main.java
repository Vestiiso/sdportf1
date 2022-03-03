package com.sd;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        //Opsætning og test af Rektangel
        Rektangel simpelRektangel= new Rektangel(0, 2, 0,20, 10,20, 10, 2);
        System.out.println("*** simpelRektangel: ***");
        System.out.println("midterpunktet er: " + simpelRektangel.findMidterpunkt());
        System.out.println("arealet er: " + simpelRektangel.findAreal());
        System.out.println("omkredsen er: " + simpelRektangel.findOmkreds() + "\n");

        //Opsætning og test af Rektangel + punkt
        Rektangel rektangelPunkt= new Rektangel(0, 1, 0,8, 6,8, 6, 1, 5, 3);
        System.out.println("*** rektangelPunkt: ***");
        System.out.println("midterpunktet er: " + rektangelPunkt.findMidterpunkt());
        System.out.println("arealet er: " + rektangelPunkt.findAreal());
        System.out.println("omkredsen er: " + rektangelPunkt.findOmkreds());
        System.out.println("er punktet inden i formen?: " + rektangelPunkt.erPunktetIndeIFormen() + "\n");

        //Opsætning og test af 2 rektangler
        Rektangel rektangler= new Rektangel(0, 1, 0,8, 6,8, 6, 1, 9, 1,
                9, 8, 15, 8, 15, 1);
        System.out.println("*** rektangler (to forskellige): ***");
        System.out.println("midterpunktet af første rektangel er: " + rektangler.findMidterpunkt());
        System.out.println("arealet af første rektangel er: " + rektangler.findAreal());
        System.out.println("omkredsen af første rektangel er: " + rektangler.findOmkreds());
        System.out.println("afstanden mellem midterpunkterne er: " + rektangler.afstandMellemFormer() + "\n");


        //Opsætning og test af trekant
        Trekant simpelTrekant= new Trekant(0, 0, 1,1, 2,0);
        System.out.println("*** simpelTrekant: ***");
        System.out.println("midterpunktet er: " + simpelTrekant.findMidterpunkt());
        System.out.println("arealet er: " + simpelTrekant.findAreal());
        System.out.println("omkredsen er: " + simpelTrekant.findOmkreds() + "\n");

        //Opsætning og test af trekant + punkt
        Trekant trekantPunkt= new Trekant(0, 0, 1,1, 2,0, 1,0.5);
        System.out.println("*** trekantPunkt: ***");
        System.out.println("midterpunktet er: " + trekantPunkt.findMidterpunkt());
        System.out.println("arealet er: " + trekantPunkt.findAreal());
        System.out.println("omkredsen er: " + trekantPunkt.findOmkreds());
        System.out.println("er punktet inden i formen?: " + trekantPunkt.erPunktetIndeIFormen() + "\n");

        //Opsætning og test af 2 trekanter
        Trekant trekanter= new Trekant(0, 0, 1,1, 2,0, 3,0,4,1,5,0);
        System.out.println("*** trekanter: ***");
        System.out.println("midterpunkt1 er: " + trekanter.findMidterpunkt());
        System.out.println("areal1 er: " + trekanter.findAreal());
        System.out.println("omkreds1 er: " + trekanter.findOmkreds());
        System.out.println("afstanden mellem midterpunkterne er: " + trekanter.afstandMellemFormer() + "\n");
    }
}
