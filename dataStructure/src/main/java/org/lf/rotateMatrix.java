package org.lf;

import java.util.Arrays;

/**
 * 旋转矩阵
 *
 * @author doulongfei
 * @date 2022/12/02
 */
public class rotateMatrix {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] ints1 = rotateMatrix(ints, ints.length);
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                System.out.print(ints1[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] rotateMatrix(int[][] mat, int n) {
        /**
         1 2 3    -->>    7 4 1
         4 5 6    -->>    8 5 2
         7 8 9    -->>    9 6 3
         */
         int[][] netMat = new int[n][n];
         for(int i=0 ;i<n;i++){
             for(int j= 0;j<n;j++){
                 netMat[i][j]=mat[n-1-j][i];
             }
         }
         return netMat;

    }
}
