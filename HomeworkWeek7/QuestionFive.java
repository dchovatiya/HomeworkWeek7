package HomeworkWeek7;

import java.util.Scanner;

public class QuestionFive
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter employee id:");
        int empID=s.nextInt();
        System.out.print("Enter employee name: ");
        String name=s.next();
        System.out.print("Enter the basic salary: ");
        int salary=s.nextInt();
        double HRA=salary*10/100;
        double DA=salary*8/100;
        double TA=salary*9/100;
        double PF=salary*20/100;
        double GS=salary+HRA+TA+DA-PF;
        System.out.println("|----------------------------|");
        System.out.println("|         Salary Slip        |");
        System.out.println("|----------------------------|");
        System.out.println("|Employee Id   :"+empID+"\t     |");
        System.out.println("|Employee Name :"+name+" \t     |");
        System.out.println("|----------------------------|");
        System.out.println("|Basic Salary:"+salary+" \t     |");
        System.out.println("|HRA 10%     :"+HRA+"         |");
        System.out.println("|TA 8%       :"+TA+"         |");
        System.out.println("|DA 9%       :"+DA+"         |");
        System.out.println("|PF -20&     :"+PF+"         |");
        System.out.println("|----------------------------|");
        System.out.println("|Gross Salary:"+GS+"        |");
        System.out.println("|----------------------------|");
        System.out.println("|----------------------------|");
    }
}
