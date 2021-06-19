package com.company;

public class Main {

    static void printField(String[][] grid) {
        System.out.println("Cinema:");
        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[r].length; c++)
                System.out.print(grid[r][c] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        String[][] field = {
                {" ","1","2","3","4","5","6","7","8"},
                {"1","S","S","S","S","S","S","S","S"},
                {"2","S","S","S","S","S","S","S","S"},
                {"3","S","S","S","S","S","S","S","S"},
                {"4","S","S","S","S","S","S","S","S"},
                {"5","S","S","S","S","S","S","S","S"},
                {"6","S","S","S","S","S","S","S","S"},
                {"7","S","S","S","S","S","S","S","S"}
        };
        printField(field);
    }
}
