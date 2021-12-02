package GDSTRUCT;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {65, 87, 50, 34, 134, 352, -63};

        System.out.println(linearSearch(numbers, -63));
        System.out.println(linearSearch(numbers, 92));
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i =0; i < input.length; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle] == value)
            {
                return middle;
            }
            else if (value < input[middle]) // value might be at left half
            {
                end = middle - 1;
            }
            else if (value > input[middle])
            {
                start = middle + 1;
            }
        }
        return -1;
    }
}
