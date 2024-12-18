import java.util.*;
class Insertionsort{
  public static void sort(int[] arr){
    int n= arr.length;
     for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements :");
    int i;
    for(i=0;i<=n-1;i++){
     arr[i] = sc.nextInt();
    }
    sort(arr);
    System.out.println("The sorted array is :");
    for(int j=0;j<=n-1;j++){
    	System.out.println(arr[j]);
    }
    
  }
}
