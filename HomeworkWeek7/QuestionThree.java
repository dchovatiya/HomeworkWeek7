package HomeworkWeek7;

import java.util.Scanner;

public class QuestionThree
{
    public static void main(String[] args)
    {
        String result;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = s.nextLine();
        System.out.print("Enter Roll no: ");
        int rollNo = s.nextInt();
        System.out.print("Enter Maths marks:");
        double maths = s.nextDouble();
        System.out.print("Enter English marks:");
        double english = s.nextDouble();
        System.out.print("Enter Science marks:");
        double science = s.nextDouble();
        double total = maths + english + science;
        double percentage = (total / 300) * 100;
        if (percentage >= 35)
        {
            result = "Pass";
        } else
        {
            result = "Fail";
        }
        if ((maths >= 0 && maths <= 100) && (english >= 0 && english <= 100) && (science >= 0 && science <= 100))
        {
            if (percentage >= 80)
            {
                grade = 'A' + '+';
            } else if (percentage >= 60)
            {
                grade = 'A';
            } else if (percentage >= 50)
            {
                grade = 'B';
            } else
            {
                grade = 'C';
            }
            System.out.println("|--------------------------------------|");
            System.out.println("|         Mark Sheet                   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Name:"+name+"                 \t   |");
            System.out.println("|    Roll No:"+rollNo+"    \t\t\t\t\t   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Subjects: Marks                   |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Maths:" +maths+"         \t\t       |");
            System.out.println("|    Science:" +science+"    \t\t\t       |");
            System.out.println("|    English:"+english+"      \t\t\t       |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Total:"+total+"       \t\t\t       |");
            System.out.println("|--------------------------------------|");
            System.out.println("|    Percentage:"+percentage+"         |");
            System.out.println("|    Result:"+result+"       \t\t\t       |");
            System.out.println("|    Grade:"+grade+"       \t\t\t\t       |");
            System.out.println("|--------------------------------------|");
        } else
        {
            System.out.println("Invalid input, Marks should be between 0 to 100.");
        }
    }
}

