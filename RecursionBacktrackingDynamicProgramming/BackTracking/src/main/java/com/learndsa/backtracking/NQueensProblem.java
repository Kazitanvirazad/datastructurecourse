package com.learndsa.backtracking;

public class NQueensProblem {
    private int[][] chessTable;
    private int numOfQueens;

    public NQueensProblem(int numOfQueens) {
        this.numOfQueens = numOfQueens;
        this.chessTable = new int[numOfQueens][numOfQueens];
    }

    public void solve() {
        // start solving the problem starting with the first column
        // another interpretation: start placing the queens starting with index
        if (setQueens(0)) {
            printQueens();
        } else {
            System.out.println("There is no solution ...");
        }
    }

    private boolean setQueens(int colIndex) {
        // it means that we have already found the location for N queens (problem solved)
        if (colIndex == numOfQueens) {
            return true;
        }
        // consider all the possible locations in the given column one by one
        for (int rowIndex = 0; rowIndex < numOfQueens; rowIndex++) {
            if (isPlaceValid(rowIndex, colIndex)) {
                // the location is valid (1 means there is a queen)
                chessTable[rowIndex][colIndex] = 1;
                // solve the problem for the next column
                if (setQueens(colIndex + 1)) {
                    return true;
                } else {
                    // Backtrack
                    chessTable[rowIndex][colIndex] = 0;
                }
            }
        }
        // cannot found a valid location (we have tried all the rows without any success)
        // have to change the position of already settled queens
        return false;
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {
        // there can not be other queens in the same row
        for (int i = 0; i < colIndex; i++) {
            if (chessTable[rowIndex][i] == 1) {
                return false;
            }
        }
        // we do not have to check the columns
        // check the diagonal locations from top left to bottom right
        for (int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--, j--) {
            if (chessTable[i][j] == 1) {
                return false;
            }
        }
        // check the diagonal locations from top right to bottom left
        for (int i = rowIndex, j = colIndex; i < chessTable.length && j >= 0; i++, j--) {
            if (chessTable[i][j] == 1) {
                return false;
            }
        }
        // the position (rowIndex, colIndex) is valid - there are no validations;
        return true;
    }

    // 1 represents the queens
    // 0 means that cell is empty
    private void printQueens() {
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable[i].length; j++) {
                if (chessTable[i][j] == 1) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
