import java.util.Scanner;
public class differenceEvenOdd {
    public static void main(String[] args){
        int evenSum = 0;
        int oddSum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(arr[i] %2 == 0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            } 
        }
        int difference = Math.abs(evenSum - oddSum);
        System.out.println(difference);
        sc.close();
    }
    
}
