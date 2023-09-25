import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birth = 0;
        String trash = "";

        System.out.print("Enter your birth month[1 - 12]: ");
        if(in.hasNextInt())
        {
            birth = in.nextInt();
            if (birth == 1)
            {
                System.out.println("Your birth month is January!");
            }
            else if(birth == 2)
            {
                System.out.println("Your birth month is Febuary");
            }
            else if(birth == 3)
            {
                System.out.println("Your birth month is March");
            }
            else if(birth == 4)
            {
                System.out.println("Your birth month is April");
            }
            else if(birth == 5)
            {
                System.out.println("Your birth month is May");
            }
            else if(birth == 6)
            {
                System.out.println("Your birth month is June");
            }
            else if(birth == 7)
            {
                System.out.println("Your birth month is July");
            }
            else if(birth == 8)
            {
                System.out.println("Your birth month is August");
            }
            else if(birth == 9)
            {
                System.out.println("Your birth month is September");
            }
            else if(birth == 10)
            {
                System.out.println("Your birth month is October");
            }
            else if(birth == 11)
            {
                System.out.println("Your birth month is November");
            }
            else if(birth == 12)
            {
                System.out.println("Your birth month is December");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Rerun the program and do proper input");
            }

        }
        else
        {
            System.out.println("You entered " + birth);
            System.out.println("Rerun the program and do proper input");
        }
    }
}