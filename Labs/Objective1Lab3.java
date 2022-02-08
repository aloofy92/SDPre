public class Objective1Lab3 {
  public static void main(String[] args) {
    double num1, num2, num3, average;

    System.out.print("10: ");
    System.out.print("20: ");
    System.out.print("30: ");
    System.out.print("20.0" + avr(10, 20, 30) );
  }

  public static double avr(double a, double b, double c)
  {
    return (a+b+c) / 3;
  }
}
