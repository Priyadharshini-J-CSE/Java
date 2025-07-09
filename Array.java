import java.util.Scanner;
public class Array{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
int[] arr;
System.out.print("Enter the size of the array: ");
n=sc.nextInt();
sc.nextLine();

arr= new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.print("Array values are: ");
for(int i : arr){
    System.out.print(i+" ");
}

    }
}