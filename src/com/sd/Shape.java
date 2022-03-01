package com.sd;

import java.util.ArrayList;

public abstract class Shape {

    ArrayList<Integer> Xkor = new ArrayList<Integer>();
    ArrayList<Integer> Ykor = new ArrayList<Integer>();

    Shape(){}

    public int findMidterpunktX(){
        return 0;
    }

    public int findMidterpunktY(){
        return 0;
    }

    public double findAreal(){
        return 0;
    }

    public double findOmkreds(){
        return 0;
    }

    public boolean erPunktetIndeIFormen(){
        return false;
    }

    public double afstandMellemFormer(){
        return 0;
    }
}
