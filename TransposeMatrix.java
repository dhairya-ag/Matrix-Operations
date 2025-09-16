import java.util.Scanner;
public class TransposeMatrix{
    public static void main(String[] args){
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
        int[][]  transpose = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("The transpose of the matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(transpose[i][j]);
            }
        }
    }
}