public class fibonacci_recursion {
    static int a=0,b=1,c;
    public static void main(String args[]) 
    {
        int i=15;
        System.out.print(a+" "+b);
        series(i-2);
      
    }
    static void series(int i)
    {
        if(i>0)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            series(i-1);
        }
    }
}
