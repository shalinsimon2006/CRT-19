import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int j=0;
        int k=0;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int even[] = new int[n];
        int odd[] = new int[n];
        for(int i = 0;i<n;i++){
            if(arr[i]%2==0){
                even[j] = arr[i];
                j++;
            }
            else{
                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even numbers:");
        for(int i = 0;i<j;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println("\nOdd numbers:");
        for(int i = 0;i<k;i++){
            System.out.print(odd[i]+" ");
        }

    }

    
}
