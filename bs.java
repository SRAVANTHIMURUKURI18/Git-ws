import java.util.Scanner;
public class BS {
    public static void main(String[] args) {
        int n, key;
        int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }        
        System.out.println("Enter the key to search : ");
        key = sc.nextInt();
        int result = binarySearch(a, 0, n - 1, key);        
        if (result == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index : " + result);
        }
    }
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;            
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }
}