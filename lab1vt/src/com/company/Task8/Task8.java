package com.company.Task8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static List<Integer> FindInsertionPositions(Integer[] sequence1, Integer[] sequence2) {
        List<Integer> insertionPositions = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < sequence1.length && j < sequence2.length) {
            if (sequence1[i] <= sequence2[j]) {
                i++;
            } else {
                insertionPositions.add(i);
                j++;
            }
        }
        while (j < sequence2.length) {
            insertionPositions.add(i);
            i++;
            j++;
        }
        return insertionPositions;
    }
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
    public static void PrintResult(Scanner in)
    {
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> sequence2 = new ArrayList<>();
        System.out.println("Sequence 1:");
        ObtainArray(in, sequence1);
        System.out.println("Sequence 2:");
        ObtainArray(in, sequence2);
        List<Integer> insertionPositions = FindInsertionPositions(sequence1.toArray(new Integer[0]), sequence2.toArray(new Integer[0]));
        System.out.println("Insert positions: " + insertionPositions);
    }
}
