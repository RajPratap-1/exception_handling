import java.util.InputMismatchException;
import java.util.Scanner;

public class handlingggg{
    public static void main(String[] args) {
        //Arithmetic exception
        try{
            int a=7;
        System.out.println(a/0);} catch (Exception obj) {
            System.out.println(obj);
        }

        System.out.println("end of the main ");
    }
} class handlinggg {
    public static void main(String[] args) {
        int a =0;
        try{
            System.out.println(a/0);

        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("end of the main");
    }
import java.util.Scanner;
    import java.lang.*;
class handliing{
    public static <ArithematicException> void main(String[] args) {

        try{
            int a=4;
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[]= {21,34,54,65,76};
            int index = sc.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);


        }
        catch(ArrayIndexOutOfBoundsException |
                ArithematicException |
                InputMismatchException )
        {
            System.out.println(obj);
        }
    }

}//finally dominate the try statement
//we can forcefully dominate the finally statement using:System.exit(status:0) inside the try statement;
//try{throw new ArithematicException("/ by zero");}
//


