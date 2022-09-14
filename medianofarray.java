// Java program to find median in an array
// Here we take marks as array name
// Creating one fuction to pass array as an argument
// function brings code reusablity
// Vishal Prajapati 14-09-2022

import java.util.*;

class medianofarray {
	
	// Function for calculating median
	public static double findMedian(int marks[], int n)
	{
		// First we sort the array 
		Arrays.sort(marks);

		// check for odd case
        //[1,5,3,2,4] here middle value is clearly 3 
        // [length/2] index location
		if (n % 2 != 0)
			return (double)marks[n / 2];
        //even case:
        //[2,6,4,8] here middle value is (6+4/2) 
        // [(length-1)/2 + (length)/2] index location
		return (double)(marks[(n - 1) / 2] + marks[n / 2]) / 2.0; //(double) -> typecasting to double data type
	}

	// Driver code
	public static void main(String args[])
	{
        //marks as array
		int marks[] = {45,87,56,99,78,97};
		int n = marks.length; //using length to find length of array by this length we check for even and odd case
	
		// Function call
		System.out.println("Median Marks = " + findMedian(marks, n));
	}
}


