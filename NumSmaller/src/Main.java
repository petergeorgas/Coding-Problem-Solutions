/*
Peter Georgas
12/23/2019

################################################################################################################################################################################

Daily Coding Problem E-mail:

This problem was asked by Google.

Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array.

For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0], since:

- There is 1 smaller element to the right of 3
- There is 1 smaller element to the right of 4
- There are 2 smaller elements to the right of 9
- There is 1 smaller element to the right of 6
- There are no smaller elements to the right of 1

################################################################################################################################################################################

 */
public class Main
{
    public static void main(String[] args)
    {
        int[] list = {3, 4, 9, 6, 1}; // Test Code
        int[] test = smaller(list);
        for(int i = 0; i < list.length; i++) // Iterate through the code.
        {
            System.out.println(test[i]);
        }
    }

    public static int[] smaller(int[] array)
    {
        int[] return_array = new int[array.length]; // Create an array the same size as the array we're going through that we will return.
        int num_smaller = 0; // Use this variable to keep track of how many numbers to the right of the elemtn are smaller
        for(int i = 0; i < array.length; i++) // Use nested for loops to traverse through the list
        {
            for(int j = i; j < array.length; j++)
            {
                if(array[j] < array[i]) // If an element to the right of the element we're currently checking is smaller
                {
                    num_smaller++; // Increment the number of elements in the array to the right smaller
                }
            }

            return_array[i] = num_smaller; // Append the total number of elements smaller than the element we're looking at to the corresponding spot in the array
            num_smaller = 0; // Reset the number of smaller elements counter.
        }
        return return_array;
    }
}
