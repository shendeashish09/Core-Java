import java.util.*;

class Calculator1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    String ch;
    do {
      System.out.println(
        "Enter Operation to be performed: (add|sub|mult|div|quit)"
      );
      ch = sc.next();
      
      System.out.println("Enter Number 1:");
      num1 = sc.nextDouble();
      System.out.println("Enter Number 2:");
      num2 = sc.nextDouble();

      switch (ch) {
        case "add":
          System.out.println(num1 + num2);
          break;
        case "sub":
          System.out.println((num1 > num2) ? (num1 - num2) : (num2 - num1));
          break;
        case "mult":
          System.out.println(num1 * num2);
          break;
        case "div":
          System.out.println(num1 / num2);
          break;
        case "quit":
          break;
        default:
           System.out.println("Invalid input");
          ch = "quit";
          break;
      }
    } while (ch != "quit");

    sc.close(); //Close the scanner
  }
}
