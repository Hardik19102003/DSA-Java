//https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
package com.hardik;

public class GetSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int num: arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest) {
                secondLargest=num;
            }
        }

        System.out.printf("Second Largest Element is: %d", secondLargest);
    }
}
