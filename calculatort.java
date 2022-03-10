import java.util.*;
public class calculatort {
    public static void main(String[]args){

        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Select the operation you want to do:\n 1 = + \n 2 = - \n 3 = * \n 4 = / \n 5 = %");
        int c = sc.nextInt();
        int sum = num1+num2;
        int dif = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;
        switch (c){
            case 1:
                System.out.println("Sum of two number is : "+sum);
                break;
            case 2:
                System.out.println("Difference of two number is :"+dif);
                break;
            case 3:
                System.out.println("Product of two number is :"+mul);
                break;
            case 4:
                System.out.println("Divison of two number is :"+div);
                break;
            case 5:
                System.out.println("Modulo of those number is :"+mod);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }
}
