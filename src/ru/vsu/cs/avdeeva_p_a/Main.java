package ru.vsu.cs.avdeeva_p_a;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int n = readNum();
        System.out.printf("Result of calculation = %d", calculateResult(n));

    }

    static int readNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int value = sc.nextInt();

        if (value < 0) {
            System.out.println("Error.Please,try again.");
            System.exit(1);
        }

        return value;
    }

    static int calculateResult(int n) {
        int sum = 0;

        if (n == 1) {
            sum = 2;
        } else {
            int tmp = 2;
            sum = 2;
            for (int i = 2; i <= n; i++) {
                tmp = tmp * 2 * i * (2 * i - 1) / (i - 1);
                sum += tmp;
            }
        }

        return sum;
    }

}







