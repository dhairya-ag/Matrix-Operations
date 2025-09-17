import java.util.Scanner;

public class Clockwise90{
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
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right = m-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Matrix after 90 degree clocwise rotation is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}