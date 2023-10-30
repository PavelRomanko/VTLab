package com.company.Task2;
import org.junit.Assert;
import org.junit.Test;
public class Task2Test
{
    @Test
    public void TestTask21()
    {
        int x = 1;
        int y = 1;
        boolean expectedValue = true;
        boolean actualValue = Task2.CalculateResult(x, y);
        Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void TestTask22()
    {
        int x = 5;
        int y = 3;
        boolean expectedValue = false;
        boolean actualValue = Task2.CalculateResult(x, y);
        Assert.assertEquals(expectedValue, actualValue);
    }

}
