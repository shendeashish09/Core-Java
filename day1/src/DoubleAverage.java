import java.util.Scanner;

class DoubleAverage {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    double num3;
    System.out.println("Enter Number 1:");
    num1 = sc.nextDouble();
    System.out.println("Enter Number 2:");
    num2 = sc.nextDouble();

    System.out.println(num1+ " is of the type "+ ((Object)num1).getClass().getSimpleName());
    System.out.println(num2+ " is of the type "+ ((Object)num2).getClass().getSimpleName());

    if(((Object)num1).getClass().getSimpleName() == "Double" && ((Object)num2).getClass().getSimpleName() == "Double"){
        num3 = (num1+num2)/2;
        System.out.println("Average of two doubles is " +num3);
    }
  }
}
