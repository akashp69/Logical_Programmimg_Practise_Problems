package com.bridgelabz.programsforjunittesting;

import java.util.Arrays;

public class SwapTwoNibbles {
    /**
     * This method is Created to get Swap Two Nibbles
     *
     */
    public static void main(String[] args) {
        /**
         * Create A Array to Swap first 4 elements with Last 4 elements
         */

        int arr [] = {0,1,1,0,0,1,0,0};
        int temp,index;
        index=(arr.length-4);
        for(int i=0;i<4;i++) {
            temp       = arr[i];
            arr[i]     = arr[index];
            arr[index] = temp;
            index++;

        }
        int arr1[]=arr;
        /**
         * Return the result {0,1,0,0,0,1,1,0}
         */
        System.out.println((Arrays.toString(arr1)));


    }
}
