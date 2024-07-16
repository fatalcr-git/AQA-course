package org.aston.course.Task_1;

public class Bowl {
    private int foodCount;

    public Bowl() {
        foodCount = 0;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood(int count) {
        if (count < 1) {
            System.out.println("Вы не можете добавить отрицательное число еды");
        } else {
            foodCount += count;
        }
    }

    public boolean removeFood(int count) {
        if (count < 1) {
            System.out.println("Вы не можете отнять отрицательное число еды");
            return false;
        } else if (foodCount < count) {
            System.out.println("В миске недостаточно еды");
            return false;
        } else {
            foodCount -= count;
        }
        return true;
    }


}
