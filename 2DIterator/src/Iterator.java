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

public class Iterator
{
    private int[][] array;
    private int last = 0; // Variable to keep track of last index of the array we looked at.
    private int inner_last = 0; // Variable to keep track of the last index of the inner array we looked at 
    public Iterator(int[][] array) 
    {
        this.array = array;
    }

    public Integer next() throws EmptyElementException
    {
        if(!hasNext()) // If there are no more elements
        {
            throw new EmptyElementException(); // Throw an exception

        }
        else // If there are more elements
        {
            if(array[last].length != 0) // If the array inside of the array isn't empty
            {
                int old_last = last; // Save a copy of the current last variable 
                int old_inner = inner_last; // Save a copy of the current inner last variable 
                if(inner_last + 1 < array[last].length) //If we can still keep going through the array inside of the array
                {
                    inner_last++; // Go to the next element. 
                }
                else // If we can't continue going through the array
                {
                    last++; // Go to the next array within the array
                    inner_last = 0; // Reset the inner index
                }
                return array[old_last][old_inner];
            }
            else // If the array inside of the array is empty
            {
                last++; // We're gonna have to go to the next array
                return next(); // Go to the next element... Recursive call. I need to analyze my base-case here.
            }
        }
    }

    public boolean hasNext() // Method called to see if the iterator has another element we can use 
    {
        return last < array.length; // This is true if the variable we use to keep track of the previous array inside of the array is less than the total length of the array.
    }
}
