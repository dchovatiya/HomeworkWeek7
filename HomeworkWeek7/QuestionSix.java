package HomeworkWeek7;
//6. Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;

public class QuestionSix
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the number");
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even.");
        }
        else
        {
            System.out.println("Number is odd.");
        }
        s.close();
    }
}
