package recursion;
import array.HomeWork1;;
public class recursiveBubbleSort {
	static void recBSort(int a[], int i, int j) {
		int temp;
		if(i==a.length) {
			return;
		}
		else
		{
			if(j==a.length-i-1)
				recBSort(a,i+1, 0);
			else
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				else
				{
					recBSort(a, i ,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {5,2,6,1,3,4};
		recBSort(a, 1 ,0);
		HomeWork1.printArray(a);
	}

}
