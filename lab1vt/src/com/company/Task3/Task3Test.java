package com.company.Task3;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class Task3Test
{
    @Test
    public void testTask3() {
        double a = 0.0;
        double b = Math.PI;
        double h = 0.1;

        List<Double> arguments = new ArrayList<>();
        List<Double> expectedValues = new ArrayList<>();

        for (double x = a; x <= b; x += h) {
            double fx = Math.tan(x);
            arguments.add(x);
            expectedValues.add(fx);
        }

        List<Double> actualValues = new ArrayList<>();
        for (double x : arguments) {
            double fx = Math.tan(x);
            actualValues.add(fx);
        }

        for (int i = 0; i < expectedValues.size(); i++) {
            double expected = expectedValues.get(i);
            double actual = actualValues.get(i);
            Assert.assertEquals(expected, actual, 0.0001);
        }
    }
}