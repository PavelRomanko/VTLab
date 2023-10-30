package com.company;

import com.company.Task1.Task1;
import com.company.Task12.Book;
import com.company.Task2.Task2;
import com.company.Task3.Task3;
import com.company.Task4.Task4;
import com.company.Task5.Task5;
import com.company.Task6.Task6;
import com.company.Task7.Task7;
import com.company.Task8.Task8;
import com.company.Task9.Task9;

import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    private static int ObtainValueInRange(Scanner in, String inputValueStr, int low, int high)
    {
        String errNumFormatStr = "Incorrect value format!";
        String errNotInRange = "Value is not in range!";
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
            if (isCorrect)
                if (res < low || res > high)
                {
                    System.out.println(errNotInRange);
                    isCorrect = false;
                }
        } while(!isCorrect);
        return res;
    }

    public static void main(String[] args)
    {
        Book book = new Book("", "", 0);

        boolean showMustGoOn = true;
        int tasksCount = 9;
        int taskNumber, decision;
        String selectTaskStr = "Select task (from 1 to " + tasksCount + "): ";
        String continueStr = "Continue?\n(1 - Yes, 2 - No): ";
        while (showMustGoOn) {
            taskNumber = ObtainValueInRange(in, selectTaskStr, 1, tasksCount);
            switch (taskNumber) {
                case 1: {
                    Task1.PrintResult(in);
                    break;
                }
                case 2: {
                    Task2.PrintResult(in);
                    break;
                }
                case 3: {
                    Task3.PrintResult(in);
                    break;
                }
                case 4: {
                    Task4.PrintResult(in);
                    break;
                }
                case 5: {
                    Task5.PrintResult(in);
                    break;
                }
                case 6: {
                    Task6.PrintResult(in);
                    break;
                }
                case 7: {
                    Task7.PrintResult(in);
                    break;
                }
                case 8: {
                    Task8.PrintResult(in);
                    break;
                }
                case 9: {
                    Task9.PrintResult();
                    break;
                }
            }
            decision = ObtainValueInRange(in, continueStr, 1, 2);
            if (decision == 2)
                showMustGoOn = false;
        }
    }
}
