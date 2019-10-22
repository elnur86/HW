package hw.hw2;

import java.util.Random;
import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args)
    {
        int i, j, x, y, z, RandomX, RandomY, PlayerX, PlayerY;
        String Array[][];

        Array= new String[6][6];
        Random number= new Random();
        RandomX=number.nextInt(5);
        RandomY=number.nextInt(5);
        RandomX=RandomX+1;
        RandomY=RandomY+1;
        //System.out.println(RandomX);
        //System.out.println(RandomY);
        for (x=1;x<6;x++)
        {
            for(y=1;y<6;y++)
            {
                Array[x][y]="-";
            }
        }
        System.out.println("` 0 | 1 | 2 | 3 | 4 | 5 |` ");
        System.out.printf("` 1 | %s | %s | %s | %s | %s |` ",Array[1][1],Array[1][2],Array[1][3],Array[1][4],Array[1][5]);
        System.out.println();
        System.out.printf("` 2 | %s | %s | %s | %s | %s |` ",Array[2][1],Array[2][2],Array[2][3],Array[2][4],Array[2][5]);
        System.out.println();
        System.out.printf("` 3 | %s | %s | %s | %s | %s |` ",Array[3][1],Array[3][2],Array[3][3],Array[3][4],Array[3][5]);
        System.out.println();
        System.out.printf("` 4 | %s | %s | %s | %s | %s |` ",Array[4][1],Array[4][2],Array[4][3],Array[4][4],Array[4][5]);
        System.out.println();
        System.out.printf("` 5 | %s | %s | %s | %s | %s |` ",Array[5][1],Array[5][2],Array[5][3],Array[5][4],Array[5][5]);
        System.out.println();
        /*
        for (x=0;x<5;x++)
        {
            for(y=0;y<5;y++)
            {
                System.out.print(Array[x][y]);
            }
            System.out.println();
        }
        */
        Scanner MyObj= new Scanner(System.in);
        do
        {
            System.out.print("Please enter line for fire [1-5]:");
            PlayerX=MyObj.nextInt();

            if (PlayerX<1 || PlayerX>5) {
                System.out.println("pirt");
                do {
                    System.out.print("Please enter correct line number [1-5]:");
                    PlayerX = MyObj.nextInt();
                }while (PlayerX<1 || PlayerX>5);
            }

            System.out.print("Please enter bar for fire [1-5]:");
            PlayerY=MyObj.nextInt();

            if (PlayerY<1 || PlayerY>5) {
                do {
                    System.out.print("Please enter correct bar number [1-5]:");
                    PlayerY = MyObj.nextInt();
                }while (PlayerY<1 || PlayerY>5);
            }
            if (PlayerX!=RandomX || PlayerY!=RandomY) {
                Array[PlayerX][PlayerY] = "*";

                System.out.println("` 0 | 1 | 2 | 3 | 4 | 5 |` ");
                System.out.printf("` 1 | %s | %s | %s | %s | %s |` ", Array[1][1], Array[1][2], Array[1][3], Array[1][4], Array[1][5]);
                System.out.println();
                System.out.printf("` 2 | %s | %s | %s | %s | %s |` ", Array[2][1], Array[2][2], Array[2][3], Array[2][4], Array[2][5]);
                System.out.println();
                System.out.printf("` 3 | %s | %s | %s | %s | %s |` ", Array[3][1], Array[3][2], Array[3][3], Array[3][4], Array[3][5]);
                System.out.println();
                System.out.printf("` 4 | %s | %s | %s | %s | %s |` ", Array[4][1], Array[4][2], Array[4][3], Array[4][4], Array[4][5]);
                System.out.println();
                System.out.printf("` 5 | %s | %s | %s | %s | %s |` ", Array[5][1], Array[5][2], Array[5][3], Array[5][4], Array[5][5]);
                System.out.println();
            }
            else
            {
                Array[PlayerX][PlayerY]="x";

                System.out.println("` 0 | 1 | 2 | 3 | 4 | 5 |` ");
                System.out.printf("` 1 | %s | %s | %s | %s | %s |` ",Array[1][1],Array[1][2],Array[1][3],Array[1][4],Array[1][5]);
                System.out.println();
                System.out.printf("` 2 | %s | %s | %s | %s | %s |` ",Array[2][1],Array[2][2],Array[2][3],Array[2][4],Array[2][5]);
                System.out.println();
                System.out.printf("` 3 | %s | %s | %s | %s | %s |` ",Array[3][1],Array[3][2],Array[3][3],Array[3][4],Array[3][5]);
                System.out.println();
                System.out.printf("` 4 | %s | %s | %s | %s | %s |` ",Array[4][1],Array[4][2],Array[4][3],Array[4][4],Array[4][5]);
                System.out.println();
                System.out.printf("` 5 | %s | %s | %s | %s | %s |` ",Array[5][1],Array[5][2],Array[5][3],Array[5][4],Array[5][5]);
                System.out.println();

            }
        }
        while (PlayerX!=RandomX || PlayerY!=RandomY);


    }
}
