
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import java.util.Scanner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wprowadź tekst:");
    String input = scanner.nextLine();
    scanner.close();

    String punctuationMarks = ".,!?;:-''";
    int count = 0;

    for (char c : input.toCharArray()) {
      if (punctuationMarks.indexOf(c) != -1) {
        count++;
      }
    }

    System.out.println("Liczba znaków interpunkcyjnych: " + count);
  }
}
