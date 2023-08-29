

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter The number which you want to print multiplication table");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(input+" X "+i+" = "+input*i);
        }
        sc.close();
    }
}
