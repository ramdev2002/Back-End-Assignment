package com.example.blogapi.findpairsum;

import java.util.Scanner;

public class Sum {
    public static void findPairWithSum(int[] array, int targetSum) {
        boolean pairFound = false;

        // it will take O(n^2) time complexity
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    if (pairFound) {
                        System.out.print(" or ");
                    }
                    System.out.print("Pair found(" + array[i] + ", " + array[j] + ")");
                    pairFound = true;
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pair found with target " + targetSum);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();

        int[] array= new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();


        findPairWithSum(array,target);
    }
}
