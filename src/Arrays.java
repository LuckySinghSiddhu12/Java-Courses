
import java.util.*;
public class Arrays {
    //index array single dim array
    public static void main(String []args){
        //int[] marks = new int[3];//int marks[] bhi use kr sakte h braket baad me bhi use kr sakte h
        //multi dimension array
        int marks[] = {67, 89, 56};
        marks[0] = 67;//physics
        marks[1] = 89;//english
        marks[2] = 56;//math
        //System.out.println(marks[0]);
      //  System.out.println(marks[1]);
       // System.out.println(marks[2]);
     //with the help of loop
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
