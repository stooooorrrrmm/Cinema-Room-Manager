package com.company;

import java.util.Scanner;

public class Main {

    static void getInfo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows:"); System.out.print("> ");
        int numberOfRows = in.nextInt(); System.out.println();

        System.out.println("Enter the number of seats in each row: "); System.out.print("> ");
        int numberOfSeats = in.nextInt(); System.out.println();

        String[][] field = new String[numberOfRows][numberOfSeats];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                field[i][j] = "S";
            }
        }
    }

    static void printField(String[][] field) {
        //System.out.println("Cinema:");
        //        for (String[] strings : field) {
        //            for (String string : strings) System.out.print(string + " ");
        //            System.out.println("\n");
        //        }


    }

    static void sold() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: "); System.out.print("> ");
        int numberOfRows = in.nextInt(); System.out.println();

        System.out.println("Enter the number of seats in each row: "); System.out.print("> ");
        int numberOfSeats = in.nextInt(); System.out.println();

        int sold = 0; int front; int back;

        if (numberOfRows * numberOfSeats < 60) {
            sold = (numberOfRows * numberOfSeats) * 10;
        }
        else {
            if (numberOfRows % 2 == 0) {
                front = ((numberOfRows / 2) * numberOfSeats) * 10;
                back = ((numberOfRows / 2) * numberOfSeats) * 8;
                sold = front + back;
            }
            else {
                if (numberOfRows % 2 != 0) {
                    front = (((numberOfRows - 1) / 2) * numberOfSeats) * 10;
                    back = (((numberOfRows + 1) / 2) * numberOfSeats) * 8;
                    sold = front + back;
                }
            }
        }

        System.out.println("Total income:");
        System.out.println("$" + sold);
    }

    public static void main(String[] args) {
        {
        }
    }
}