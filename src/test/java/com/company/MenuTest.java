package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {


    // Test case for add()

    @Test
    void testAdd() {
        assertEquals(20.0d, (new Menu()).add(10.0d, 10.0d));
        assertEquals(11.0d, (new Menu()).add(1.0d, 10.0d));
        assertEquals(10.5d, (new Menu()).add(0.5d, 10.0d));
        assertEquals(9.5d, (new Menu()).add(-0.5d, 10.0d));
    }


    // Test case for sub() method

    @Test
    void testSub() {
        assertEquals(0.0d, (new Menu()).sub(10.0d, 10.0d));
        assertEquals(-9.0d, (new Menu()).sub(1.0d, 10.0d));
        assertEquals(-9.5d, (new Menu()).sub(0.5d, 10.0d));
        assertEquals(-10.5d, (new Menu()).sub(-0.5d, 10.0d));
    }

    // Test case for mul() method

    @Test
    void testMul() {
        assertEquals(100.0d, (new Menu()).mul(10.0d, 10.0d));
        assertEquals(10.0d, (new Menu()).mul(1.0d, 10.0d));
        assertEquals(5.0d, (new Menu()).mul(0.5d, 10.0d));
        assertEquals(-5.0d, (new Menu()).mul(-0.5d, 10.0d));
    }

    // Test case for div() method

    @Test
    void testDiv() {
        assertEquals(1.0d, (new Menu()).div(10.0d, 10.0d));
        assertEquals(0.1d, (new Menu()).div(1.0d, 10.0d));
        assertEquals(0.05d, (new Menu()).div(0.5d, 10.0d));
        assertEquals(-0.05d, (new Menu()).div(-0.5d, 10.0d));
    }

    // Test case for exp() method

    @Test
    void testExp() {
        assertEquals(1.0E10d, (new Menu()).exp(10.0d, 10.0d));
        assertEquals(1.0d, (new Menu()).exp(1.0d, 10.0d));
        assertEquals(9.765625E-4d, (new Menu()).exp(0.5d, 10.0d));
        assertEquals(9.765625E-4d, (new Menu()).exp(-0.5d, 10.0d));
    }

    // Test case for squareRoot() methode

    @Test
    void testSquareRoot() {
        assertEquals(3.1622776601683795d, (new Menu()).squareRoot(10.0d));
    }

}