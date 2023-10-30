package com.company.Task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
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
        double a, b, h;
        List<Double> arguments = new ArrayList<>();
        List<Double> values = new ArrayList<>();
        String inputAStr = "Input A value: ";
        String inputBStr = "Input B value: ";
        String inputHStr = "Input H value: ";
        a = ObtainValue(in, inputAStr);
        b = ObtainValue(in, inputBStr);
        h = ObtainValue(in, inputHStr);
        CalculateResult(a, b, h, arguments, values);
        System.out.println("Argument\tValue");
        for (int i = 0; i < arguments.size(); i++) {
            System.out.printf("%.2f\t\t%.2f\n", arguments.get(i), values.get(i));
        }
    }
    private static void CalculateResult (double a, double b, double h, List<Double> arguments, List<Double> values)
    {
        for (double x = a; x <= b; x += h) {
            double fx = Math.tan(x);
            arguments.add(x);
            values.add(fx);
        }
    }
}