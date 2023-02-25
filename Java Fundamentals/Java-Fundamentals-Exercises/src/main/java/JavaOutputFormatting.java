import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaOutputFormatting {

    public static void main(String[] args){
          try {
              File file = new File("C:\\Local Disk\\Homework\\Maven-Training\\Maven-Project-demo\\src\\main\\resources\\InputFiles\\Java Output Formatting");
              Scanner scanner = new Scanner(file);
              Collection<String> stringCol = new ArrayList<String>();
              Collection<Integer> intCol = new ArrayList<Integer>();

              String myString;
              int myInt;

              while(scanner.hasNext()) {
                  myString = scanner.next();
                  stringCol.add(myString);

                  myInt = scanner.nextInt();
                  intCol.add(myInt);
              }

              Iterator<Integer> iterator = intCol.iterator();

              System.out.print("================================");
              System.out.println();

              stringCol.forEach((e) -> {
                  System.out.print(e);
                  //int temp = iterator.next();


                  if((int)iterator.next() / 100 != 0) {
                      for (int i = 0; i < 15 - e.length(); i++)
                          System.out.print(" ");
                  }
                  else {
                      if((int)iterator.next() /10 != 0){
                          for (int i = 0; i < 15 - e.length(); i++)
                              System.out.print(" ");
                          System.out.print("0");
                      }
                      else {
                          for (int i = 0; i < 15 - e.length(); i++)
                              System.out.print(" ");
                          System.out.print("00");
                      }
                  }

                  System.out.println(iterator.next());
              });

              System.out.print("================================");


          }catch (FileNotFoundException fnfe) {
              System.out.println(fnfe);
          }
    }
}
