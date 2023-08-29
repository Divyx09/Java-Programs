package if_Else;

import java.util.Scanner;

public class Lagerst_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        if ((input1 > input2) && (input1 > input3))
            System.out.println(input1 + " is greater");
        else if ((input2 > input1) && (input2 > input3))
            System.out.println(input2 + " is greater");
        else if ((input3 > input1) && (input3 > input2))
            System.out.println(input3 + " is greater");
    }
}
