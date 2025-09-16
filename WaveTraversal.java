import java.util.Scanner;
public class WaveTraversal{
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
        System.out.println("The wave form traversal elements are: ");
        for(int j=0;j<m;j++){
            if(j%2==0){
                for (int i = 0; i < n; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}