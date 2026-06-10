import java.util.Scanner;
public class ControlFlow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if (arr[i] < 10000) sum+= arr[i]*.05;
            else if (arr[i] >= 10000 && arr[i] <50000) sum += arr[i] *.15;
            else sum += arr[i] * .3;
        }
        System.out.println("total tax: " + sum);
    }   
}
