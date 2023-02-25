import java.util.Scanner;
import java.util.*;

public class ReadUntilEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while(scanner.hasNext())
        {
            System.out.print(counter + " ");
            System.out.println(scanner.nextLine());
            counter++;
        }
    }
}
