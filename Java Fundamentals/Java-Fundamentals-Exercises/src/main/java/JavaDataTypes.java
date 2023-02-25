import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Scanner;
import  java.util.*;

public class JavaDataTypes {

    public static void main(String[] args) {

    try{
        File file = new File("C:\\Local Disk\\Homework\\Maven-Training\\Maven-Project-demo\\src\\main\\resources\\InputFiles\\DataTypes");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        DataTypes dataTypes = new DataTypes();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            try {
                long number = scanner.nextLong();
                System.out.print("\n" + number + " can be fitted in:\n");
                dataTypes.getByte(number);
                dataTypes.getShort(number);
                dataTypes.getInt(number);
                dataTypes.getLong(number);
                System.out.println();
            }catch(Exception e){
                scanner.nextLine();
                System.out.println(" can't be fitted anywhere");
            }
        }
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
    }

    }
}
