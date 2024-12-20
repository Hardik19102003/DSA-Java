package com.hardik;

public class Print_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {  { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 } };

        int left = 0;
        int right = matrix[0].length-1;
        int up = 0;
        int down = matrix.length-1;

        while(left <= right && up <= down){
            for(int i=left; i<=right; i++){
                System.out.print(matrix[up][i]+" ");
            }
            up++;

            for(int i=up; i<=down; i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            if(left<=right && up<=down){
                for (int i = right; i >= left ; i--) {
                    System.out.print(matrix[down][i]+" ");
                }
                down--;

                for (int i = down; i >= up ; i--) {
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }

        }

    }
}
