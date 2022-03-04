package com.sd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CirkelTest {

    @Test
    public void erPunktetIndeIFormen() {
        Cirkel tester = new Cirkel(0,0,1,2,2);
        assertEquals(false,tester.erPunktetIndeIFormen());
    }
}