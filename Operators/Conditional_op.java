package Operators;

import java.util.Scanner;

public class Conditional_op {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Check the person is eligible or not");
        System.out.print("Enter the age: ");
        int input = sc.nextInt();
        String operation = (input >=18)?"Can vote":"Can't vote";
        System.out.println(operation);
        sc.close();
    }
}
