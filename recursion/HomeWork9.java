package recursion;

public class HomeWork9 {
  static	int[] allOccurence(int array[], int data, int index, int count) {
	  int result[];
		if(index==array.length)
		{
			int a[]=new int[count];
			return a;
		}
		else
		{
			if(array[index]==data)
				result= allOccurence(array, data, index+1, count+1);
			else
				int result[]=allOccurence(array, data, index+1, count);
		}
	}

	public static void main(String[] args) {
		
	}

}
