/*
Peter Georgas
12/23/2019

###########################################################################################################################

Daily Coding Problem E-mail:

This problem was asked by Uber.

Implement a 2D iterator class. It will be initialized with an array of arrays, and should implement the following methods:

next(): returns the next element in the array of arrays. If there are no more elements, raise an exception.
has_next(): returns whether or not the iterator still has elements left.
For example, given the input [[1, 2], [3], [], [4, 5, 6]], calling next() repeatedly should output 1, 2, 3, 4, 5, 6.

Do not use flatten or otherwise clone the arrays. Some of the arrays can be empty.

###########################################################################################################################

*/

public class Main
{
    public static void main(String[] args)
    {
        int[][] test = {{1,2}, {}, {}, {}, {4,5,6,7,9}}; // Test Code
        Iterator iterator = new Iterator((test));
        try
        {
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
        catch(EmptyElementException EEE)
        {
            System.out.println("EEEE");
        }
    }
}
