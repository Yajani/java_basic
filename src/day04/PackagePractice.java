package day04;
//import fruit.Banana;
//import fruit.Grape;
import fruit.*; //모든 것 가져오기
import fruit.warm.PineApple;

import java.util.Scanner;

public class PackagePractice {
    public static void main(String[] args) {
        new fruit.Apple();
        Banana banana = new Banana();
        PineApple pineApple = new PineApple();

        Grape grape = new Grape();

        Scanner sc = new Scanner(System.in);
    }
}
