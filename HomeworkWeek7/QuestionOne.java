package HomeworkWeek7;

import java.util.Scanner;

public class QuestionOne
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = s.nextInt();
        //Ternary operator to check the number
        String answer= a%2==0 ? "Even" : "Odd";
        System.out.println(a + " is " + answer );
        s.close();
    }
}

