package com.company.Task1;

import java.util.Scanner;

public class Task1
{
    public static double CalculateResult (double x, double y)
    {
        double res;
        res = (1 + Math.sin(x + y) * Math.sin(x + y))/(2 + Math.abs(x - ((2 * x)/(1 + x * x * y * y)))) + x;
        return res;
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
        double res, x, y;
        String inputXStr = "Input X value: ";
        String inputYStr = "Input Y value: ";
        x = ObtainValue(in, inputXStr);
        y = ObtainValue(in, inputYStr);
        res = CalculateResult(x, y);
        System.out.println("Result: " + res);
    }
}
