package com.company.Task9;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void AddBall(Ball ball) {
        balls.add(ball);
    }

    public double GetTotalWeight() {
        double totalWeight = 0.0;
        for (Ball ball : balls) {
            totalWeight += ball.GetWeight();
        }
        return totalWeight;
    }

    public int CountBlueBalls() {
        int blueCount = 0;
        for (Ball ball : balls) {
            if (ball.GetColor().equalsIgnoreCase("blue")) {
                blueCount++;
            }
        }
        return blueCount;
    }
}
