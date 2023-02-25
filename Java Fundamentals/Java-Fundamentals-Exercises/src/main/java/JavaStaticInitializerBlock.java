import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static class BreadthAndHeightException extends Exception{
        public String toString(){
            return "Breadth and height must be positive!";
        }
    }
    public static void main(String[] args){

/*        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        Exception myBreadthAndHeightException = new BreadthAndHeightException();
        try{
            if(breadth >0 && height >0) {
                System.out.println(breadth * height);
            }
            else{
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}
