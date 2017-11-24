package com.david;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringServerTest {

    private StringServer stringServer = new StringServer();

    @Test
    public void testDoNothing() {
        assertEquals("Hello World", stringServer.toNoChange("Hello World"));
        assertEquals("Hello", stringServer.toNoChange("Hello"));
    }

    @Test
    public void testValueLower() {
        assertEquals("hello world", stringServer.toLower("Hello World"));
        assertEquals("hello", stringServer.toLower("Hello"));
    }

    @Test
    public void testValueUpper() {
        assertEquals("HELLO WORLD", stringServer.toUpper("Hello World"));
        assertEquals("HELLO", stringServer.toUpper("Hello"));
    }

    @Test
    public void testValueReverse() {
        //noinspection SpellCheckingInspection
        assertEquals("dlroW olleH", stringServer.toReverse("Hello World"));
        assertEquals("olleH", stringServer.toReverse("Hello"));
    }

    @Test
    public void testValueRemoveSpaces() {
        //noinspection SpellCheckingInspection
        assertEquals("HelloWorld", stringServer.toRemoveSpaces("Hello World"));
        assertEquals("Hello", stringServer.toRemoveSpaces("Hello"));
    }
}