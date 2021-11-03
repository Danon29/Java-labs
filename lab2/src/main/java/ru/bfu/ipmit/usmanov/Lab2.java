package ru.bfu.ipmit;
import java.util.Arrays;


public class Lab2 {
    static byte[] getKSmallestNumbers(byte[] array, int k) {
        Arrays.sort(array);
        byte[] kSmallestArray = new byte[k];
        try {
            System.arraycopy(array, 0, kSmallestArray, 0, k);
        } catch (Throwable emptyArrayException) {
            System.out.println("Error: Array size is lesser than k");
            return new byte[]{};
        }
        return kSmallestArray;
    }

    static boolean arePermutations(String firstString, String secondString) {

        if (firstString.length() != secondString.length())
            return false;

        char[] firstStringConvertedToChar = firstString.toCharArray();
        char[] secondStringConvertedToChar = secondString.toCharArray();

        Arrays.sort(firstStringConvertedToChar);
        Arrays.sort(secondStringConvertedToChar);

        return Arrays.equals(firstStringConvertedToChar, secondStringConvertedToChar);
    }

    static int[][] rotateMatrix(int[][] matrix) {
        int[][] resultArray = new int[matrix[0].length][matrix.length];
        int[][] emptyArray = new int[][]{};
        if (Arrays.deepEquals(resultArray, emptyArray) || matrix[0].length != matrix.length) {
            System.out.println("Error: matrix is empty");
            return new int[][]{};
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultArray[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        return resultArray;
    }


    public static void main(String[] args) {
        int kNumbers = 2;
        byte[] arr = new byte[]{};
        for (var num : getKSmallestNumbers(arr, kNumbers)) {
            System.out.print(num + " ");
        }
    }
}
