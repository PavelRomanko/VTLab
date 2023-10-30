package com.company.Task2;

import java.util.Scanner;

public class Task2 {
    public static boolean CalculateResult(double x, double y)
    {
        return (((x <= 6 && x >= -6) && (y <= 0 && y >= -3)) || ((x <= 4 && x >= -4) && (y <= 5 && y >= 0)));
    }
    private static double ObtainValue(Scanner in, String inputValueStr)
    {
        String errNumFormatStr = "Incorrect value format!";
        double res = 0;
        boolean isCorrect;
        do {
            try
            {
                System.out.print(inputValueStr);
                res = Double.parseDouble(in.nextLine());
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
    public static void PrintResult(Scanner in)
    {
        double x, y;
        boolean res;
        String inputXStr = "Input X value: ";
        String inputYStr = "Input Y value: ";
        x = ObtainValue(in, inputXStr);
        y = ObtainValue(in, inputYStr);
        res = CalculateResult(x, y);
        System.out.println("Result: " + res);
    }
}
