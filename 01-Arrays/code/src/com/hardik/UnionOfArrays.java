//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
package com.hardik;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 6, 7 };
        ArrayList<Integer> list = findUnion(a, b);
        System.out.println(list);
    }
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        TreeSet<Integer> set = new TreeSet<Integer>();

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        return list;
    }
}
