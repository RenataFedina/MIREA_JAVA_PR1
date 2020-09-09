package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void summ() //сумма элемнтов массива
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int i : arr)
        {
            sum+=i;
        }
        System.out.println("for: "+ sum);

        sum = 0;
        int i = 0;
        while (i < 9)
        {
            sum+=arr[i];
            i++;
        }
        System.out.println("while: "+sum);

        i = 0;
        sum = 0;
        do
        {
            sum= sum+arr[i];
            i++;
        } while(i<9);
        System.out.println("do while: "+sum);
    }

    public static void Garmon() //задание с гармоническим рядом
    {
        double sum = 0.0;
        for(int i = 1; i < 10; i++)
        {
            System.out.format("%.2f", 1.0/i);
            System.out.print(" ");
            sum = sum + 1.0/i;
        }
        System.out.println();
        System.out.println("Сумма " + sum);
    }

    public static void bubblesort(int[] arr) //сортировка
    {
        for(int i = arr.length-1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
    }

    public static void GArr() //рандом массива и сортировка
    {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) //первый способ рандома
        {
            arr[i] = (int)Math.round((Math.random()*10));
            System.out.print(arr[i]+" ");
        }

       /* for(int i = 0; i < arr.length; i++) //второй способ рандома
        {
            Random random = new Random();
            arr[i] = random.nextInt(11);
            System.out.print(arr[i]+" ");
        } */

        System.out.println();
        bubblesort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static void Fact(int a)
    {
        int f = 1;
        for(int i = 1; i < a; i++)
        {
            f*=i;
        }
        System.out.println("Факториал: " + f);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        summ();
        Garmon();
        GArr();
        Fact(number);
    }
}