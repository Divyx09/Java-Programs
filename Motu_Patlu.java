

import java.util.Scanner;
public class Motu_Patlu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 0, m = 0, i = 1;

        while (i <= n) {
            if (n >= i) {
                p = i;
                n = n - p;
            } else {
                p = n;
            }

            if (n >= 2 * i) {
                m = i * 2;
                n = n - m;
            } else {
                m = n;
            }

            i++;
        }

        if (p > m) {
            System.out.println("Motu");
        } else {
            System.out.println("Patlu");
        }

            scanner.close();
    }
}

