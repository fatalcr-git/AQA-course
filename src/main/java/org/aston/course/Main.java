package org.aston.course;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"},
        };
        String[][] wrongSizeArray = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11"},
                {"13","14","15","16"}
        };
        String[][] wrongDataArray = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","ten","11","12"},
                {"13","14","15","16"},
        };
        processArray(correctArray);
        processArray(wrongSizeArray);
        processArray(wrongDataArray);
    }

    public static void processArray(String[][] arr) {
        try {
            System.out.println("Sum of elements: " + ArrayProcessor.sumOfElements(arr));
        } catch (MyArraySizeException | MyArrayDataException e ) {
            System.out.println(e.getMessage());
        }
    }
}