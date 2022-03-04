package com.sd;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrekantTest {

    @Test
    public void erPunktetIndeIFormen() {
        Trekant tester = new Trekant(1,1,2,2,3,3);
        assertEquals(false, tester.erDetInde);
    }
}