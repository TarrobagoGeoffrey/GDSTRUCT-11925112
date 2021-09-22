package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 39;
        numbers[1] = 69;
        numbers[2] = 80;
        numbers[3] = 10;
        numbers[4] = 23;
        numbers[5] = 42;
        numbers[6] = 67;
        numbers[7] = 58;
        numbers[8] = 90;
        numbers[9] = 74;

        int[] number = new int[10];

        number[0] = 42;
        number[1] = 53;
        number[2] = 59;
        number[3] = 24;
        number[4] = 92;
        number[5] = 10;
        number[6] = 93;
        number[7] = 231;
        number[8] = 152;
        number[9] = 97;

        System.out.println("Before Bubble sort:");
        printArrayElements(numbers);

        System.out.println("Before Selection sort:");
        printArrayElements(number);


        selectionSort(number);
        bubbleSort(numbers);

        System.out.println("\n\nAfter Selection sort");
        printArrayElements(number);

        System.out.println("\n\nAfter Bubble sort");
        printArrayElements(numbers);


    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastsortedindex = arr.length - 1; lastsortedindex > 0; lastsortedindex--)
        {
            for (int i = 0; i < lastsortedindex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 1;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
