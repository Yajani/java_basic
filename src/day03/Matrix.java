package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int koreaScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimscores = {koreaScore, mathScore, engScore};
        int[] parkscores = {100, 34, 99};
        int[] hongscores = {10,100,11};

        //2차원 배열
        int[][] classScores = {kimscores, parkscores, hongscores};

        System.out.println(classScores[0][0]);
        System.out.println(kimscores[0]);

        System.out.println(classScores[0][2] - classScores[0][1]);
        System.out.println(Arrays.toString(classScores)); //주소를 보여줌
        System.out.println(classScores[1]); //parkScores와 주소값이 같다
        System.out.println(parkscores);

        System.out.println(Arrays.deepToString(classScores)); //주소말고 안에 요소를 보여줌

        //2차원배열의 초기화
        int[][] arr2d = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {100,200,300}
        };
        System.out.println("===============================");
        System.out.println(arr2d[1][2]);

        int[] arr3 = arr2d[2];

        //2차원 배열의 순회
        for (int[] arr  :arr2d){
            for (int n :arr){
                System.out.printf("%3d ",n );
            }
            System.out.println();
        }



    }
}
