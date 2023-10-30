package com.company.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    private static int ObtainValue(Scanner in, String inputValueStr)
    {
        String errNumFormatStr = "Incorrect value format!";
        int res = 0;
        boolean isCorrect;
        do {
            try
            {
                System.out.print(inputValueStr);
                res = Integer.parseInt(in.nextLine());
                isCorrect = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(errNumFormatStr);
                isCorrect = false;
            }
        } while(!isCorrect);
        return res;
    }
    private static void ObtainArray(Scanner in, List<Integer> array)
    {
        int n;
        n = ObtainValue(in, "Enter the number of array elements: ");
        for (int i = 0; i < n; i++)
        {
            array.add(ObtainValue(in, String.format("Enter value of the array(%d): ", i + 1)));
        }
    }
    public static int FindMinimumElementsToRemove(Integer[] A) {
        int n = A.length;
        int[] dp = new int[n];
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }

        return n - maxLength;
    }
    public static void PrintResult(Scanner in)
    {
        List<Integer> array = new ArrayList<>();
        ObtainArray(in, array);
        int k = FindMinimumElementsToRemove(array.toArray(new Integer[0]));
        System.out.println("Minimum elements to remove: " + k);
    }
}
