package com.codecool.termlib;

public enum Color {
  BLACK ("0"),
  RED ("1"),
  GREEN ("2"),
  YELLOW ("3"),
  BLUE ("4"),
  MAGENTA ("5"),
  CYAN ("6"),
  WHITE ("7");

  public final String colorCode;

  Color(String colorCode) {
      this.colorCode = colorCode;
  }
  private String colorCode() { return colorCode; }

}
