public class Assignment2 {
     final double PI = 3.14; // - Use the final keyword to declare the PI variable.
     int addNumbers(Integer num1,Integer num2){
return num1+num2;
     }
    public static void main(String[] args){

        Integer num1=10;// - Use Integer wrapper class to represent integer values.
        Integer num2=20;// - Use Integer wrapper class to represent integer values.
        Assignment2 obj =new Assignment2();
        Integer res=obj.addNumbers(num1, num2);
        System.out.print(res);

    }
}