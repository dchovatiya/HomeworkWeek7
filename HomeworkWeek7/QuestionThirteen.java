package HomeworkWeek7;

import java.util.Scanner;

public class QuestionThirteen
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input number between 1 to 7:");
        int i=s.nextInt();
        switch (i){
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
        s.close();
    }
}
