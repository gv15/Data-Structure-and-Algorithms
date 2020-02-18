package recursion;

public class HomeWork6 {
	static boolean isSortAsc(int arr[], int index) {
		boolean result;
		if(arr[index]==arr.length-1) //Base case
			return true;
		else
		{
			if(arr[index]<arr[index+1])
				 result=isSortAsc(arr, index+1); // small problem
			else
				return false;
		}
		return result;
	}

	public static void main(String[] args) {
		int array[]= {1,3,6,7};
		boolean result=isSortAsc(array, 0);
		if(result==true)
			System.out.println("Sorted");
		else
			System.out.println("Unsorted");

	}

}
