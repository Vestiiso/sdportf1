package com.sd;

import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.*;

public class RektangelTest {

    @Test
    public void testErPunktetIndeIFormen() {
        Rektangel tester = new Rektangel(0,0,0,1,1,1,1,0,2,2);
        assertEquals(false, tester.erPunktetIndeIFormen());

    }
}