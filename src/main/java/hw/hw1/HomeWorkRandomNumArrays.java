package hw.hw1;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkRandomNumArrays
{
    public static void main(String[] args)
    {
    int i, j, z, temp, RandomNumber, GuessNumber,ArrayNumber[];
    ArrayNumber = new int[50];
    Random number= new Random();
    RandomNumber=number.nextInt(100);
    //System.out.println(RandomNumber);

    Scanner MyObj= new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String Name = MyObj.nextLine();

    System.out.println("Let the game begin! ");

    System.out.println("Please enter your best guess from 0 to 100");
    GuessNumber = MyObj.nextInt();
        i=1;
        do {
            ArrayNumber[i]=GuessNumber;
            i++;
            if (GuessNumber>RandomNumber)
            {
                System.out.println("Your number is too big. Please, try again");
            }
            else
            {
                System.out.println("Your number is too small. Please try again");
            }
        GuessNumber = MyObj.nextInt();
        }while(GuessNumber!=RandomNumber);

        System.out.printf("Congratulations %s!!!\n", Name);
        z=i;

        for (j=1;j<z;j++)
        {
        for (i=1;i<z;i++)
            {
            if (ArrayNumber[i] < ArrayNumber[i + 1])
                {
                temp = ArrayNumber[i];
                ArrayNumber[i] = ArrayNumber[i + 1];
                ArrayNumber[i + 1] = temp;
                }
            }
        }
        System.out.println();
        for (i=1;i<j;i++)
        {
            System.out.print(ArrayNumber[i]);
            System.out.print(" ");
        }
    }
}

