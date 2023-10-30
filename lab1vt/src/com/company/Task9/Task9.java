package com.company.Task9;
public class Task9 {
    public static void PrintResult()
    {
        Ball ball1 = new Ball(1.5, "blue");
        Ball ball2 = new Ball(2.0, "red");
        Ball ball3 = new Ball(1.8, "blue");
        Ball ball4 = new Ball(2.2, "green");

        Basket basket = new Basket();

        basket.AddBall(ball1);
        basket.AddBall(ball2);
        basket.AddBall(ball3);
        basket.AddBall(ball4);

        System.out.printf("Weight: %.1f\nBlue balls count: %d\n", basket.GetTotalWeight(), basket.CountBlueBalls());
    }
}
