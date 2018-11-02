package com.david;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringServerTest {

    private StringServer stringServer = new StringServer();

    @Test
    public void testDoNothing() {
        assertEquals("Hello World", stringServer.toNoChange("Hello World"));
        assertEquals("Hello", stringServer.toNoChange("Hello"));
        assertEquals("", stringServer.toNoChange(""));
        assertEquals(" ", stringServer.toNoChange(" "));
    }

    @Test
    public void testValueLower() {
        assertEquals("hello world", stringServer.toLower("Hello World"));
        assertEquals("hello", stringServer.toLower("Hello"));
        assertEquals(" ", stringServer.toNoChange(" "));
        assertEquals("", stringServer.toNoChange(""));
    }

    @Test
    public void testValueUpper() {
        assertEquals("HELLO WORLD", stringServer.toUpper("Hello World"));
        assertEquals("HELLO", stringServer.toUpper("Hello"));
        assertEquals("", stringServer.toNoChange(""));
        assertEquals(" ", stringServer.toNoChange(" "));
    }

    @Test
    public void testValueReverse() {
        //noinspection SpellCheckingInspection
        assertEquals("dlroW olleH", stringServer.toReverse("Hello World"));
        assertEquals("olleH", stringServer.toReverse("Hello"));
        assertEquals("", stringServer.toNoChange(""));
        assertEquals(" ", stringServer.toNoChange(" "));
    }

    @Test
    public void testValueRemoveSpaces() {
        assertEquals("HelloWorldWar", stringServer.toRemoveSpaces(" Hello World War "));
        assertEquals("HelloWorld", stringServer.toRemoveSpaces("Hello World"));
        assertEquals("Hello", stringServer.toRemoveSpaces("Hello"));
        assertEquals("", stringServer.toNoChange(""));
        // assertEquals("", stringServer.toNoChange(" "));
    }
}