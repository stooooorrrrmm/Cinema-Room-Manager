package com.company;

import java.util.Scanner;

public class Main {

    static void getInfo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int numberOfRows = in.nextInt();
        System.out.println();

        System.out.println("Enter the number of seats in each row: ");
        System.out.print("> ");
        int numberOfSeats = in.nextInt();
        System.out.println();

        String[][] field = new String[numberOfRows][numberOfSeats];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                field[i][j] = "S";
            }
        }

        printField(field, numberOfRows, numberOfSeats);
        getTickets(field, numberOfRows, numberOfSeats);
    }

    static void printField(String[][] field, int numberOfRows, int numberOfSeats) {
        System.out.println("Cinema:");
        System.out.print("  ");

        for (int i = 0; i <= numberOfRows; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < numberOfRows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 1; j < numberOfSeats + 1; j++) {
                System.out.print(field[i][j - 1] + " ");
            }
            System.out.println();
        }
    }

    static void sold(String[][] field, int numberOfRows, int numberOfSeats, int rowNumber) {

        int sold = 10;

        if (numberOfRows * numberOfSeats < 60) {
            sold = 10;
        } else {
            if (numberOfRows % 2 == 0) {
                if (rowNumber < numberOfRows / 2) {
                    sold = 10;
                } else {
                    if (rowNumber > numberOfRows / 2) {
                        sold = 8;
                    }
                }
            } else {
                if (numberOfRows % 2 != 0) {
                    if (rowNumber < (numberOfRows - 1) / 2) {
                        sold = 10;
                    } else {
                        if (rowNumber > (numberOfRows - 1) / 2) {
                            sold = 8;
                        }
                    }
                }
            }
        }

        System.out.print("Ticket price: ");
        System.out.println("$" + sold);
        System.out.println();

        printField(field, numberOfRows, numberOfSeats);
    }

    static void getTickets(String[][] field, int numberOfRows, int numberOfSeats) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter a row number:");
        System.out.print("> ");
        int rowNumber = in.nextInt();
        System.out.println();

        System.out.println("Enter a seat number in that row:");
        System.out.print("> ");
        int seatNumber = in.nextInt();
        System.out.println();

        field[rowNumber - 1][seatNumber - 1] = "B";
        sold(field, numberOfRows, numberOfSeats, rowNumber);
    }

    public static void main(String[] args) {
        {
            getInfo();
        }
    }
}