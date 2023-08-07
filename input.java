import java.util.Scanner;

class input {
    public static void main(String[] args) {
    	
        Scanner ob = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = ob.nextInt();
        System.out.println("You entered " + number);

        ob.close();
    }
}
