package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res=0;
        while(true) {
            System.out.print("Enter an operator(+, -, *, /, %) or press 'q' to quit: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter 2 numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+')
                    res = a + b;
                else if (op == '-')
                    res = a - b;
                else if (op == '*')
                    res = a * b;
                else if (op == '/') {
                    if(b != 0)
                        res = a / b;
                    else
                        System.out.println("Denominator cannot be 0");
                }
                else if (op == '%')
                    res = a % b;

                System.out.println(a + " " +op+ " " +b+ " = " + res);
            }
            else if(op == 'q')
                break;
            else
                System.out.println("Invalid Operator");
        }

    }
}
