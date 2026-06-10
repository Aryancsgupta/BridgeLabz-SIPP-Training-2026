import java.util.Scanner;
public class RangeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 9 && arr[i] >= 0) {
                System.out.println("Number is in range");
            } else {
                System.out.println("Number is out of range");   
            }
        }
    }
}