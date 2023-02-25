import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Local Disk\\Homework\\Java Fundamentals\\Maven-Project-demo\\src\\main\\resources\\InputFiles\\Currency Formatter Input File");
            Scanner scanner = new Scanner(file);
            double payment = scanner.nextDouble();
            Locale INDIA = new Locale("en","IN");
            String paymentUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String paymentIndia = NumberFormat.getCurrencyInstance(INDIA).format(payment);
            String paymentChina = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String paymentFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
            System.out.print("US: ");
            System.out.println(paymentUS);
            System.out.print("India: ");
            System.out.println(paymentIndia);
            System.out.print("China: ");
            System.out.println(paymentChina);
            System.out.print("France: ");
            System.out.println(paymentFrance);


        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }
}
