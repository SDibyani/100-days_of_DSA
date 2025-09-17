import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 =sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int n=1;

        System.out.print("HCF of the 2 number is : ");
        if(num1 != num2){
            while( n !=0){
                n = num1 % num2;
                if( n != 0){
                    num1 = num2;
                    num2 =n;
                }
            }
            System.out.println(num2);
        } else 
         System.out.println("wrong Input");

         sc.close();
    }
    
}
