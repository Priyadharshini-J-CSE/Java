import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Your Roll number: ");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Class: ");
        String class_details=sc.nextLine();
        System.out.println("Your Name: "+name);
        System.out.println("Your Roll: "+roll);
        System.out.println("Your Class: "+class_details);
        
    }
}