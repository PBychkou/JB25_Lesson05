import java.util.Scanner;
import java.util.Random;

public class HW_15_1_TestFraction {

    public static void main(String[] args) {

        HW_15_1_Fraction[] arr = new HW_15_1_Fraction[getArrLength()];
        createArr(arr);
        printArr(arr);
        
    }

    public static int getArrLength() {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        System.out.print("Enter the length of Array, k: ");
        if (scan.hasNextInt()) {
            k = scan.nextInt();
        }
        scan.close(); 
        return k;             
    }    
    

    public static void createArr(HW_15_1_Fraction[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new HW_15_1_Fraction();
            
            arr[i].setNum(rand.nextInt(9)+1);
            arr[i].setDen(rand.nextInt(9)+1);
        }
    }

    public static void printArr(HW_15_1_Fraction[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Fraction_" + i + ": " + arr[i].getNum() + "/" + arr[i].getDen());
        }
        
    }
}