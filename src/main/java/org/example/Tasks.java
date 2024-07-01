package org.example;

public class Tasks {

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void printPositiveOrNegative(int value) {
        System.out.println(value >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean isPositive(int value) {
        return value >= 0;
    }

    public static void printStringNTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void reverseArrayValues (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static int[] fillArrayNaturalNumbers(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public static int[] doubleNumbersLessSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static int[][] createMatrixWithCross(int size) {
        int [][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static int[] createArrayWithInitialValue(int size, int initialValue) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
