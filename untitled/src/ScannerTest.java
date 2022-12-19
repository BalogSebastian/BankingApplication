import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a charachter");
        //
        char c = scanner.next().charAt(0); // get me the first charachter
        System.out.println("value = " + c);
    }
}
