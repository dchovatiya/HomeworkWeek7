package HomeworkWeek7;
//19. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class AverageValueOfArray
    {
        public static void main(String[] args)
        {
            int []array={1,2,3,4,5,6,7};
            int average;
            int sum=0;
            for(int i=0;i<array.length;i++)
            {
                sum=sum+array[i];
            }
            System.out.println("Array elements are as below:");
            System.out.println(Arrays.toString(array));
            average=sum/ array.length;
            System.out.println("The average value of array elements is: " +average);
        }
    }
