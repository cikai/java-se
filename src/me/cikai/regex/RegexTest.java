package me.cikai.regex;

import java.util.regex.Pattern;

public class RegexTest {
  
  public static void main(String[] args) {
    
    System.out.println(Pattern.matches("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", "13612345678"));
  
  }
  
}
