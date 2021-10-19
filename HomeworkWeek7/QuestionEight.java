package HomeworkWeek7;

import java.util.Scanner;

public class QuestionEight
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input any character from A to F:");
        char alphabet=s.next().charAt(0);
        if(alphabet=='A')
        {
            System.out.println("Aberdeen");
        }else if(alphabet=='B')
        {
            System.out.println("Bombay");

        }else if(alphabet=='C')
        {
            System.out.println("Chennai");
        }else if(alphabet=='D')
        {
            System.out.println("Delhi");
        }else if(alphabet=='E')
        {
            System.out.println("Erbium");
        }else if(alphabet=='F')
        {
            System.out.println("Faridabad");
        }
        else
        {
            System.out.println("Invalid Entry.");
        }
        s.close();
    }
}

