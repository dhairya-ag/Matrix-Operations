import java.util.Scanner;

public class SparseMatrix{
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
        int nonZero = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                    nonZero++;
                }
            }
        }
        int[][] sparse = new int[nonZero][3];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = matrix[i][j];
                    k++;
                }
            }
        }
        System.out.println("The sparse matrix representation is: ");
        for(int i=0;i<nonZero;i++){
            System.out.println(sparse[i][0]+ " "+sparse[i][1]+" "+sparse[i][2]);
        }
    }
}