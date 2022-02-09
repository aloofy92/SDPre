public class Objective7Lab5 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_Menu_");
      System.out.println("1. Say Hello");
      System.out.println("2. List My favorite foods");
      System.out.println("3. Exit");
      System.out.println();

      selection = scanner.netInt();

    }

    scanner.close();
  }
}
