/* Solve : Write java application to accept int(emp id) , 
    double(salary) , emp's first name , is permanent :  boolean from Scanner 
    & display the same using printf
*/
import java.util.Scanner;

class TestScanner {

  public static void main(String[] args) {
    //create Scanner object, Wrapping stdin
    Scanner sc = new Scanner(System.in);
    // sc++; Gives compiler error as reference types cannot perform arithematic operations
    System.out.println("Enter Employee id, salary, name and boolean");
    System.out.printf(
      "Emp Id: %d, Salary: %.2f, Name: %s, Is Permanent: %b %n",
      sc.nextInt(),
      sc.nextDouble(),
      sc.next(),
      sc.nextBoolean()
    );

    //Close the scanner
    sc.close();
    //Check commit
  }
}
