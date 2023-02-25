import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaLoopsII {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Local Disk\\Homework\\Maven-Training\\Maven-Project-demo\\src\\main\\resources\\InputFiles\\JavaLoops Input");
            Scanner scanner = new Scanner(file);
            int q = scanner.nextInt();
            int a,b,n;
            double calculus;

            while(q>0){
                a = scanner.nextInt();
                b = scanner.nextInt();
                n = scanner.nextInt();
                for(int i=0;i<n;i++) {
                    int j = i;
                    calculus = a;
                    while(j>=0) {
                        calculus += Math.pow(2, j) * b;
                        j--;
                    }
                    System.out.print((int)calculus + " ");
                    }
                System.out.println();
                q--;
                calculus = 0;
            }
        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }
}
