package com.codecool.termlib;

public enum Direction {
    UP ("A"),
    DOWN ("B"),
    FORWARD ("C"),
    BACKWARD ("D");

    public final String cursorCode;

    Direction(String cursorCode) {
        this.cursorCode = cursorCode;
    }
    private String cursorCode() { return cursorCode; }
}
