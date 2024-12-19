//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
package com.hardik;

public class LenOfLongestSubarr_Positive {
    public static void main(String[] args) {
         int[] arr = {10, 5, 2, 7, 1, 9};
         int k = 15;
         int n = arr.length;

         int maxlen = 0;
         int start=0,end=0,sum=0;

        while(end < n) {
            sum+=arr[end];
            if(sum == k){
                if(end-start+1>maxlen){
                    maxlen=end-start+1;
                }
            }

            while (sum > k){
                sum-=arr[start++];
            }

            end+=1;
        }

        System.out.println(maxlen);


    }
}
