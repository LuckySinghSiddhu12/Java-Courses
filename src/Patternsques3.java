public class Patternsques3 {
    public static void main(String[] args) {
        int n = 4;

    //outer loops
    //for(int i = 1; i<=n; i++){
        //inverted star
        for(int i = n; i>=1; i--){
        //inner loops
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


}
