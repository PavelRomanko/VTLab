package com.company.Task1;
import org.junit.Assert;
import org.junit.Test;
public class Task1Test
{
    @Test
    public void TestTask1()
    {
        int x = 8;
        int y = 2;
        double expectedValue = 8.13041f;
        double actualValue = Task1.CalculateResult(x, y);
        Assert.assertEquals(expectedValue, actualValue, 0.0001);
    }

}
