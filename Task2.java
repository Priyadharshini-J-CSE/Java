//Two Dimenstional Array
import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=5;
        int n2=3;
        int[][] arr;
        arr= new int[n1][n2];
        for(int i=0;i<n1;i++){ // n1--> arr.length
            for(int j=0;j<n2;j++){ // n2 --> arr[i].length
          arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}