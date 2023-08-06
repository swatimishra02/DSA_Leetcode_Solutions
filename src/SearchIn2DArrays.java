import java.util.Scanner;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter dimensions of array: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("enter elements in the array: ");
        input(arr, m,n);
        System.out.println("enter element you want to find: ");
        int e = in.nextInt();
        search(arr, e, m, n);
    }
    static void input(int[][] arr, int m, int n){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<m; i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
    }
    static void search(int[][] arr, int e, int m, int n){
        for(int i = 0; i<m; i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==e){
                    System.out.println("the element exists at index "+ i + " " + j);
                    return;
                }
            }
        }
        System.out.println("element does not exist");
    }
}
