class Exception_handling {
    public static void main(String[] args) {
  
      try {
  
        int divideByZero = 5 / 0;
        System.out.println("Rest of code in try block");
        System.out.println(divideByZero);
      }
      
      catch (ArithmeticException e) {
        System.out.println("ArithmeticException => " + e.getMessage());
      }
    }
  }