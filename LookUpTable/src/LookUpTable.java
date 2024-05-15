import java.util.ArrayList;

public class LookUpTable {

    
    static double[][] arr;
   
    

    public LookUpTable(double[][] userArr){
        this.arr = userArr;
    }
    public static void main(String[] args) {
        System.out.println();
    }

    public static ArrayList<Double> userWant(double indexY){
        //double[][] newArr = new double[][]
        ArrayList <Double> userNums = new ArrayList <Double>();
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr[0].length-1; j++){
                if(arr[i][j] == indexY){
                     userNums.add(indexY);
                     indexY = Double.parseDouble(System.console().readLine("Enter a new number to check: "));
                    
                     
                }
                else{
                    System.out.println("number wasnt found in the loop up table try again");
                    indexY = Double.parseDouble(System.console().readLine("Enter a new number to check: "));
                    

                }
            }
           
            
        }
        
    
        return userNums;
    }
}

