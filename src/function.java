
import java.util.*;
public class function {
   /* public static void printMyName(String name){
        System.out.println(name);
        return;*/
   //sum two no
    //public  static int calculateSum(int a, int b){
      //  int sum = a + b;
        //return sum;

    //}
    //product two no
    public static int calculateProduct(int a, int b){
       return a * b;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //printMyName(name);

        //  int sum = calculateSum(a ,b);
        //   System.out.println("sum of two number is: " + sum);
        // int product = calculateProduct(a ,b);
          System.out.println("product of two number is: " + calculateProduct(a , b));
    }
}
