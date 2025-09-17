
import java.util.Scanner;

public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of coloumns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int top =0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++){
                System.out.println(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                System.out.println(matrix[bottom][i]);
            }
            }
            
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                System.out.println(matrix[i][left]);
            }
            }
            
            left++;
            
        }
    }
}