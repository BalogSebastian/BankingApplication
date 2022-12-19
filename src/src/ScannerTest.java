import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a charachter");
        int a = scanner.nextInt();
        char c = scanner.next().charAt(0); // get me the first charachter
        System.out.println("value = " + c);
    }
}
