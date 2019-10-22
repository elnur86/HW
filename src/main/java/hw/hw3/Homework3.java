package hw.hw3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        String[][] schedule= new String[7][2];
        int i,j;
        String InputDay, InputActivity;

        schedule[0][0]="Monday";
        schedule[0][1]="Do HomeWork for Tuesday";
        schedule[1][0]="Tuesday";
        schedule[1][1]="Classes for Tuesday";
        schedule[2][0]="Wednesday";
        schedule[2][1]="Do HomeWork for Thursday";
        schedule[3][0]="Thursday";
        schedule[3][1]="Classes for Thursday";
        schedule[4][0]="Friday";
        schedule[4][1]="Do HomeWork for Saturday";
        schedule[5][0]="Saturday";
        schedule[5][1]="Classes for Saturday";
        schedule[6][0]="Sunday";
        schedule[6][1]="Relax";

        Scanner Input = new Scanner(System.in);

        do
            {
            int check;


            System.out.print("Please, input the day of the week: ");
            InputDay= Input.nextLine();
            check=0;

            for (i=0;i<7;i++)
            {
             if(InputDay.compareToIgnoreCase(schedule[i][0])==0)
             {
                 System.out.printf("Your tasks for %s: %s\n",schedule[i][0], schedule[i][1]);
                 check++;
             }
            }
            if (check==0 && InputDay.compareToIgnoreCase("exit")!=0) System.out.print("Sorry, I don't understand you, ");

            }while(InputDay.compareToIgnoreCase("exit")!=0);
    }
}
