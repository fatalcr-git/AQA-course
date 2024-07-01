package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1: ");
        Tasks.printThreeWords();

        System.out.println("Task2: ");
        Tasks.checkSumSign(10, -10);

        System.out.println("Task3: ");
        Tasks.printColor(115);

        System.out.println("Task4: ");
        Tasks.compareNumbers(10, 25);

        System.out.println("Task5: ");
        System.out.println(Tasks.checkSumInRange(1, 19));

        System.out.println("Task6: ");
        Tasks.printPositiveOrNegative(4812);

        System.out.println("Task7: ");
        System.out.println(Tasks.isPositive(-20));

        System.out.println("Task8: ");
        Tasks.printStringNTimes("Jaba", 3);

        System.out.println("Task9: ");
        System.out.println(Tasks.isLeapYear(2024));

        System.out.println("Task10: ");
        int[] arrZeroOnes = new int[]{0,0,0,1,1,1,0,0,0};
        System.out.println("До изменения: ");
        for (int i : arrZeroOnes) {
            System.out.print(i + " ");
        }
        Tasks.reverseArrayValues(arrZeroOnes);
        System.out.println("\nПосле изменения: ");
        for (int i : arrZeroOnes) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask11: ");
        int[] arrWithNaturalNumbers = Tasks.fillArrayNaturalNumbers(100);
        for (int i : arrWithNaturalNumbers) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask12: ");
        int[] arrWithNumbersLessSix = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Tasks.doubleNumbersLessSix(arrWithNumbersLessSix);
        for (int i : arrWithNumbersLessSix) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask13: ");
        int[][] matrix = Tasks.createMatrixWithCross(6);
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Task14: ");
        int[] arrWithTens = Tasks.createArrayWithInitialValue(10, 10);
        for (int i : arrWithTens) {
            System.out.print(i + " ");
        }

    }
}