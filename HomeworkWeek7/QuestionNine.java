package HomeworkWeek7;

import java.util.Scanner;

public class QuestionNine
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the character:");
        char a=s.next().charAt(0);
        switch(a) {
            case ('A'):
                System.out.println("Aberdeen");
                break;
            case ('B'):
                System.out.println("Bangkok");
                break;
            case ('C'):
                System.out.println("Chandigarh");
                break;
            case ('D'):
                System.out.println("Delhi");
                break;
            case ('E'):
                System.out.println("Erbium");
                break;
            case ('F'):
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        s.close();
    }
}
