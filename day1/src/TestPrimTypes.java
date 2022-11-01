
public class TestPrimTypes {

  public static void main(String[] args) {
    int data = 100;
    if (data == 100) System.out.println("Yes"); else System.out.println("No"); // the value in the if bracket should be boolean else it will give compile time error

    System.out.println("Max Integer " + Integer.MAX_VALUE);
    System.out.println("Max Integer " + Integer.MIN_VALUE);

    //byte b1=100; //no error
    // byte b2=128; // Compiler error as the range of byte is from -128 to 127

    byte b1 = 10;
    byte b2 = 5;
    //byte b3=b1+b2; //Compiler error as Any arithmetic operation involving byte,short
    // --- automatically promoted to --int, compiler goes by the type not value

    byte b3 = (byte) (b1 + b2); //Typecasting or forceful conversion

    b1 += 10; // b1 = (byte) (b1+10); It internally does the typecasting automatically

    int i = b1; // automatic type conversion
    long l1 = 1234565474;
    float f = l1; //no javac error : long --> float automatic conversion

    // f = 123.456; Type mismatch: cannot convert from double to float

    double d = 12345.678F; // automatic conversion
  }
}
