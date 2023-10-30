package com.company.Task4;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4Test
{
    @Test
    public void TestTask4()
    {
        Integer[] array = {2, 4, 7, 9, 10, 11, 15};
        Integer[] primeArray = {2, 7, 11};
        List<Integer> arrayAsList = new ArrayList<>(Arrays.asList(array));
        List<Integer> expectedValues = new ArrayList<>(Arrays.asList(primeArray));
        List<Integer> actualValues = new ArrayList<>();
        Task4.ObtainPrimeArray(arrayAsList, actualValues);
        Assert.assertEquals(actualValues, expectedValues);
    }
}
