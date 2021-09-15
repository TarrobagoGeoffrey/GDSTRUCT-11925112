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

        System.out.println("Before Selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter Selection sort");
        printArrayElements(numbers);
    }

    private static void bubblesort(int[] arr)
    {
        for (int lastsortedindex = arr.length - 1; lastsortedindex > 0; lastsortedindex--)
        {
            for (int i = 0; i < lastsortedindex; i++)
            {
                if (arr[i] > arr[i + 1])
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
            int largestIndex = 0;

            for (int i = 0; i <= lastSortedindex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[lasrgestIndex] = temp;

        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
