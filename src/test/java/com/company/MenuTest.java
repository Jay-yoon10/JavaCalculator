package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {



    // Test case for add()

    @Test
    void add() {
        Menu menu = new Menu();
        double result = menu.add(2, 3);
        assertEquals(5, result);
    }
    // Test case for sub()
    @Test
    void sub() {
        Menu menu = new Menu();
        double result = menu.sub(2, 3);
        assertEquals(-1, result);
    }
    // Test case for mul()
    @Test
    void mul() {
        Menu menu = new Menu();
        double result = menu.mul(2, 3);
        assertEquals(6, result);
    }

    // Test case for div()
    @Test
    void div() {
        Menu menu = new Menu();
        double result = menu.div(2, 3);
        assertEquals(0.6666666666666666, result);
    }
    // Test case for exp()
    @Test
    void exp() {
        Menu menu = new Menu();
        double result = menu.exp(2, 3);
        assertEquals(8, result);
    }

    // Test case for squareRoot()
    @Test
    void squareRoot() {
        Menu menu = new Menu();
        double result = menu.squareRoot(4);
        assertEquals(2, result);
    }

}