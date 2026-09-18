import java.util.*;

public class Calculator
{
    public static void main(String[]args)
    {
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Mod");


        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice");
        int choice =sc.nextInt();
        
        System.out.println("Enter the Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        

       switch(choice)
       {
        case 1:
        System.out.println("Sum = "+(a+b));
        break;

        case 2:
        System.out.println(a-b);
        break;

        case 3:
        System.out.println(a*b);
        break;

        case 4:
        //if(b!=0)
        if(b > 0 || b < 0)
        {
            System.out.println(a/b);
        }
        else
        {
            System.out.println("b shud not be zero");
        }  
        break;

        case 5:
        System.out.println(a%b);
        break;

        default:
            System.out.println("Invalid Input");
       
            }

    }

}
