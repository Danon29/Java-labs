package ru.bfu.ipmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetKSmallestNumbersTests {

    @Test
    void shouldNumbers() {
        byte[] firstTestArray = {8, 9, 1, 10};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(firstTestArray, k);

        byte[] expectedResult = {1, 8};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnNulls() {
        byte[] firstTestArray = {0, 0, 0, 0};
        int k = 3;

        byte[] actualResult = Lab2.getKSmallestNumbers(firstTestArray, k);

        byte[] expectedResult = {0, 0, 0};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void emptyArrayCase() {
        byte[] firstTestArray = {};
        int k = 3;

        byte[] actualResult = Lab2.getKSmallestNumbers(firstTestArray, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void kIsNull() {
        byte[] firstTestArray = {1,3,5,7};
        int k = 0;

        byte[] actualResult = Lab2.getKSmallestNumbers(firstTestArray, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
}

class ArePermutationsTests {
    @Test
    void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "ab1";
        String secondString = "b1a";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }

    @Test
    void shouldReturnTrue() {
        String firstString = "";
        String secondString = "";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }

    @Test
    void shouldReturnFalse() {
        String firstString = "111";
        String secondString = "1111";

        assertFalse(Lab2.arePermutations(firstString, secondString));
    }

    @Test
    void differentAlphabetCase() {
        String firstString = "aaa";
        String secondString = "ааа"; //a is in cyrillic

        assertFalse(Lab2.arePermutations(firstString, secondString));
    }
}

class RotateMatrixTests {
    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnEmpty() {
        int[][] matrix = {{}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void notSquaredMatrixCase() {
        int[][] matrix = {{0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }

}