/*
Peter Georgas
2/19/2020

###########################################################################################################################

Daily Coding Problem E-mail:

This problem was asked by Amazon.

Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input [1, 2, 3, 10], you should return 7.

Do this in O(N) time.

###########################################################################################################################
*/
public class SmallestNotSum
{
    public static int smallestNot(int[] array)
    {
        int smallest = 1;
        for(int i = 0; i < array.length && array[i] <= smallest; i++) // For as long as i is smaller than the length of the array and the current element is smaller than the smallest value
        {
            smallest = smallest + array[i]; // Add the current smallest value to the  element we're currently on
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        // Test Code
        int[] test1 = {1,2,3,10};
        System.out.println(smallestNot(test1));

        int[] test2 = {};
        System.out.println(smallestNot(test2));

        int[] test3 = {1,2,18,22};
        System.out.println(smallestNot(test3));
    }
}
