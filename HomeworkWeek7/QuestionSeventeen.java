package HomeworkWeek7;
//17. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class QuestionSeventeen
{
    public static void main(String[] args)
    {
        int[] array1={ 1,5,6,9,8,7,4,5,6,7,8,9,10};
        String[] array2={"Orange","Apple","Banana","Kiwi","Pineapple"};
        //Arrays is a class which consist static methods that are used with arrays
        System.out.println("Array1: " + Arrays.toString(array1)); //Will display the entered array list items
        Arrays.sort(array1); //Will sort the array
        System.out.println("Sorted numeric array: " +Arrays.toString(array1));

        System.out.println("Array1: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array: " +Arrays.toString(array2));
    }
}
