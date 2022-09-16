// Java program to find median in an array
// Here we take marks as array name
// Creating one fuction to pass array as an argument
// Creating another function to sort an array
// function brings code reusablity
// Vishal Prajapati 14-09-2022 assignment_1

class MedianOfArray {
	
	// Method for finding median
	public static double findMedian(int marks[], int n)
	{
		//Before Sorting
		System.out.print("Before Sorting: ");
		for (int i = 0; i < marks.length; i++)
		System.out.print(marks[i] + " ");

		marks =sortArray(marks);//calling sortArray method

		System.out.print("\n");//for new line
		
		//After Sorting
		System.out.print("After Sorting:  ");
		for (int i = 0; i < marks.length; i++)
		System.out.print(marks[i] + " ");

		double result;

		// check for odd case
        // [length/2] middle index location
		if (n % 2 != 0){
			result = marks[n / 2];
			System.out.println("\n"+"Middle Value is "+marks[n / 2]);
			return result;
		}
        //even case: 
        // [(length-1)/2 + (length)/2] index location
		result = (marks[(n - 1) / 2] + marks[n / 2]) / 2.0;
		System.out.println("\n"+"("+marks[(n - 1) / 2]+" + "+marks[n / 2]+") / 2.0 = "+result );
		return result; 
	}

	//method to sort an array
	public static int[] sortArray(int array[]){
		int temp;

		for(int i=0; i<array.length; i++){
			for(int j = i+1; j< array.length; j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	// Driver code
	public static void main(String args[])
	{
        //marks as array
		int marks[] = {45,87,56,99,78};
		int n = marks.length; //using length to find length of array by this length we check for even and odd case
	
		// Method call
		System.out.println("Median Marks = " + findMedian(marks, n));
	}
}


