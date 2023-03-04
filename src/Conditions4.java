import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;

public class Conditions4 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        //  if (button == 1){
        //    System.out.println("hello");
        //}
        //  else if (button == 2){
        //    System.out.println("namaste");
        //}
         //else if (button == 3){
          //  System.out.println("Bonjour");
          //}else{
        //    System.out.println("Invalid Button");
        //  }
        switch (button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("namaste");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button ");
        }
    }

}


