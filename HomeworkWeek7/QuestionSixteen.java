package HomeworkWeek7;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class QuestionSixteen
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input any number:");
        int num=s.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive.");
        }else if(num<0)
        {
            System.out.println("Number is negative.");
        }
        else
        {
            System.out.println("Number is zero.");
        }
        s.close();
    }
}
