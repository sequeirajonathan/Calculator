import java.util.*;

class Main {
  static Scanner scnr = new Scanner(System.in);
  public static void main (String [] args) {
    
    System.out.println("Welcome to calculator ");
    System.out.println("Enter (+ , - , *, /, %) to start ");
    char input = scnr.next().charAt(0);
    double firstNum;
    double SecondNum;
    
    if (input != '+' && input != '-' && input != '*' && input != '/' && input != '%') {
    do {
      System.out.println("Please enter a valid operator");
      input = scnr.next().charAt(0);
    } while (input != '+' && input != '-' && input != '*' && input != '/' && input != '%');
    }
    
    switch(input){
      case '+': 
        System.out.println("\nWelcome to addition ");
        System.out.println("Enter two number you wish to add");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println("Answer is: " + add(firstNum,SecondNum));
        break;
        
      case '-': 
        System.out.println("\nWelcome to subtraction ");
        System.out.println("Enter two number you wish to subtract");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println("Answer is: " + subtract(firstNum,SecondNum));
        break;
        
      case '*': 
        System.out.println("\nWelcome to multiplication ");
        System.out.println("Enter two number you wish to multiply");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println("Answer is: " + multiply(firstNum,SecondNum));
        break;
        
      case '/': 
        System.out.println("\nWelcome to division ");
        System.out.println("Enter two number you wish to divide");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        do {
        
          try {
                if (SecondNum == 0)
                SecondNum = (int)(1/0);
              }
          catch (ArithmeticException e) {
             System.out.println("Cannot Divide by Zero!");
             System.out.println("\nEnter two number you wish to divide");
             firstNum = scnr.nextDouble();
             SecondNum = scnr.nextDouble();
              }
        } while (SecondNum == 0);
        
        System.out.println("Answer is: " + divide(firstNum,SecondNum));
        break;
        
      case '%': 
        System.out.println("\nWelcome to remainder ");
        System.out.println("Enter two number to find the remainder");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        do {
        
          try {
                if (SecondNum == 0)
                SecondNum = (int)(1/0);
              }
          catch (ArithmeticException e) {
             System.out.println("Cannot Divide by Zero!");
             System.out.println("\nEnter two number to find the remainder");
             firstNum = scnr.nextDouble();
             SecondNum = scnr.nextDouble();
              }
        } while (SecondNum == 0);
        
        System.out.println("Answer is: " + mod(firstNum,SecondNum));
        break;
      
      default: 
        break;
    }
    
    System.out.println("\nThank you for using calculator!");
    
    
  }
  
  public static double add (double a, double b) {
    return a + b;
    
  }
  
   public static double subtract (double a, double b) {
    return a - b;
    
  }
  
   public static double multiply (double a, double b) {
    return a * b;
    
  }
  
   public static double divide (double a, double b) {
     
     return a / b;
  }

   public static double mod (double a, double b) {
    return a % b;
    
  }
}
