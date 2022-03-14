package com.jetbrains;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    //x - x^3/3! + x^5/5! - x^7/7! + x^9/9! - x^11/11! + x^13/13! - x^15/15! + x^17/17! - x^19/19! + x^21/21!

    public static void main(String[] args) {
        System.out.print("Do you want to input in degrees?(Y/n): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.length() == 1) {
            System.out.print("Your number: ");
            double radians = Double.parseDouble(scanner.nextLine());
            if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
                while (radians < 0) {
                    radians += 360;
                }
                radians = Math.PI / 180 * radians;
            }

            sin(radians);
        } else
            System.out.println("Error: Exit");
    }

    public static void sin(double num) {
        while (num >= Math.PI * 2) {
            num -= Math.PI * 2;
        }

        if (num < Math.PI * 3 / 2) {
            if (num < Math.PI) {
                if (num >= Math.PI / 2)
                    num = Math.PI - num;
            } else {
                num = (num - Math.PI) * -1;
            }
        } else {
            num = (Math.PI * 2 - num) * -1;
        }

        double curNum = num;
        BigInteger fact = new BigInteger("1");
        double exactSin = Math.sin(curNum);

        System.out.println("\t\tExact value (by Math library, method sin(double)): " + exactSin);
        System.out.println("\t\tMY_VALUE\t\t\t\tDIFFERENCE");

        double res = 0;
        for (long i = 1; i <= 10; i++) {
            System.out.print(i + ".\t\t");

            fact =
                    new BigInteger(String.valueOf(fact.multiply(
                            new BigInteger(String.valueOf(((i * 2) + 1) * (i * 2))))
                    ));
            curNum = i % 2 == 1 ?
                    curNum - Math.pow(num, (i * 2) + 1) / fact.intValue() :
                    curNum + Math.pow(num, (i * 2) + 1) / fact.intValue();

            System.out.print(curNum);
            System.out.print("\t\t" + Math.abs(exactSin - curNum));

            System.out.println();

            if (i == 10)
                res = curNum;
        }
        System.out.println("The nearest value: " + res);
    }
}
