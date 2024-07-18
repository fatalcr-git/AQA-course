package org.aston.course;

public class ArrayProcessor {
    public static int sumOfElements(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        if (arr.length != 4) {
            throw new MyArraySizeException("Incorrect array size.");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Incorrect array size.");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Not a number at [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
