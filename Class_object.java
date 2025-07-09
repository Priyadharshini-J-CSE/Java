import java.util.Scanner;
public class Class_object{
    public static class A{ // static class should be created
        Scanner sc = new Scanner(System.in);
        int num1;
        void get(){
          num1=sc.nextInt();
        }
        void put(){
            System.out.print("The value of the given number is: "+num1);
        }
    }
    public static void main(String[] args){
      A obj = new A();
      obj.get();
      obj.put();

    }
}