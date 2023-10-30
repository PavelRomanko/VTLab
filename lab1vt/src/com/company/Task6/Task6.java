package com.company.Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task6 {
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
    public static int[][] CreateShiftedMatrix(Integer[] sequence) {
        int n = sequence.length;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int offset = i;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sequence[offset];
                offset = (offset + 1) % n;
            }
        }
        return matrix;
    }
    public static void PrintResult(Scanner in)
    {
        List<Integer> sequence = new ArrayList<>();
        ObtainArray(in, sequence);
        int [][] matrix = CreateShiftedMatrix(sequence.toArray(new Integer[0]));
        System.out.println("Result:");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}