package com.company.Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task7 {
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
    public static Integer[] SortArray(Integer[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }
        } while (swapped);
        return array;
    }
    public static void PrintResult(Scanner in)
    {
        List<Integer> array = new ArrayList<>();
        ObtainArray(in, array);
        array = Arrays.asList(SortArray(array.toArray(new Integer[0])));
        System.out.println("Result: " + array);
    }
}
