import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int pos = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                pos = mid;
                System.out.println("\nElement found at index: "+pos);
                break;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(pos == -1){
            System.out.println("\nElement not found");
        }else{
            System.out.println("Element found at index: "+pos);
        }
        
    }
    
}
