import java.util.Scanner;
public class asciivalue 
{
    public static void main (String args[])
    {
        System.out.print("Enter the character : ");
        Scanner sc = new Scanner(System.in);
        char chr=sc.next().charAt(0);
        int asciivalue=chr;
        System.out.println("ASCII value of "+chr+" is "+asciivalue );
        sc.close();
    }
}