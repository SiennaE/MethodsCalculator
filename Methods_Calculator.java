
/**
 * Write a description of class Methods_Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Methods_Calculator
{
    static double add(double x, double y)
    {
        return x + y;
    }
    static double subtract(double x, double y)
    {
        return x - y;
    }
    static double multiply(double x, double y)
    {
        return x * y;  
    }
    static double divide(double x, double y)
    {
        return x / y;
    }
    static double power(double x, double y)
    {
        return Math.pow(x,y);
    }
    static void clear()
    {
        System.out.print('\u000C');
    }
    
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        
        int choice;
        double x;
        double y;
        String restart;
        boolean runProgram = true;
        
        do
        {
            System.out.println("What math operation would you like to use? (Type 1/2/3/4/5)");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. To the nth power");
            System.out.println(" ");
            System.out.print("Your choice: ");
            choice = user_input.nextInt();
            System.out.println(" ");
            System.out.println("Please input your variables.");
            System.out.print("x = ");
            x = user_input.nextDouble();
            System.out.print("y = ");
            y = user_input.nextDouble();
            System.out.println(" ");
            
            if (choice == 1) //addition
            {
                System.out.println(x + " + " + y + " = " + add(x, y));
            }
            else if (choice == 2) //subtraction
            {
                System.out.println(x + " - " + y + " = " + subtract(x, y));
            }
            else if (choice == 3) //multiplication
            {
                System.out.println(x + " x " + y + " = " + multiply(x, y));
            }
            else if (choice == 4) //division
            {
                System.out.println(x + " / " + y + " = " + divide(x, y));
            }
            else if (choice == 5)
            {
                System.out.println(x + "^" + y + " = " + power(x, y));
            }
            System.out.println(" ");
            System.out.print("Would you like to run the program again? (Type \"yes\" or \"no\")  ");
            restart = user_input.next();
            
            if (restart.equals("no") || restart.equals("No"))
            {
                runProgram = false;
            }
            
            clear();
        } while (runProgram);
    }
}
