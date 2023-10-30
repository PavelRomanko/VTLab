package com.company.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
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
    public static void ObtainPrimeArray(List<Integer> array, List<Integer> primeArray)
    {
        for (Integer integer : array) {
            if (IsPrimeNumber(integer))
                primeArray.add(integer);
        }
    }
    public static void PrintResult(Scanner in)
    {
        List<Integer> array = new ArrayList<>();
        List<Integer> primeArray = new ArrayList<>();
        ObtainArray(in, array);
        ObtainPrimeArray(array, primeArray);
        System.out.println("Prime numbers: " + primeArray);
    }
    private static boolean IsPrimeNumber(int number)
    {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
