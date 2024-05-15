import java.util.Arrays;
import java.util.Random;

public class ToLUT {
    public static void main(String[] args) {
        int rows = Integer.parseInt(System.console().readLine("Enter how many rows will the arr have: "));
        int cols = Integer.parseInt(System.console().readLine("Enter how many rows will the arr have: "));
       
        double[][] arr = new double[rows][cols];
            Random random = new Random();

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextDouble() * 100; 
            }
        }
        
        LookUpTable LUP = new LookUpTable(arr);
        double number = arr[0][0];
        // for me to know what the 2d arr is so i would write it down and see if the code works (personally i dont think about a number this "big")
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + arr[i][j] + "],");
            }
        }
        System.out.println();
         System.out.println(number);
        System.out.println(arr.length);
        System.out.println(LUP.userWant(number)); 
      
        
    }
}
//the name is ToLUT a shortcut to To Look Up Table