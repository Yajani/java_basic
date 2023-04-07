package day10.exception;

import day09.abs.Main;

public class ThrowsMain {
    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();
        int n = te.inputNumber();
        int m = te.convert("100");
    }
}
