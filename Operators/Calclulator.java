package Operators;

import java.util.Scanner;

public class Calclulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator = 0;
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // double z = sc.nextDouble();
        switch (operator) {
            case '+': {
                System.out.println(x + y);

                break;
            }
            case '-': {
                System.out.println(x - y);
                break;
            }
            case '*': {
                System.out.println(x * y);
                break;
            }
            case '/': {
                System.out.println(x / y);
                break;
            }
            default: {
                System.out.println("ERROR:Please select Valid Case");
            }

        }
        sc.close();
    }

}
