package com.company.Task9;
import org.junit.Assert;
import org.junit.Test;
public class Task9Test {
    @Test
    public void testBasket() {
        Ball ball1 = new Ball(1.5, "blue");
        Ball ball2 = new Ball(2.0, "red");
        Ball ball3 = new Ball(1.8, "blue");
        Ball ball4 = new Ball(2.2, "green");

        Basket basket = new Basket();

        basket.AddBall(ball1);
        basket.AddBall(ball2);
        basket.AddBall(ball3);
        basket.AddBall(ball4);

        double expectedTotalWeight = 7.5;
        Assert.assertEquals(expectedTotalWeight, basket.GetTotalWeight(), 0.01);

        int expectedBlueCount = 2;
        Assert.assertEquals(expectedBlueCount, basket.CountBlueBalls());
    }
}
