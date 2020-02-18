package array;
//Reverse an array
public class HomeWork1 {
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++)
			//System.out.print(a[i]+'\t');
		System.out.print(a[i]+"\t");
		
	}
	static void reverseArray(int a[]) {
		int temp;
		for(int i=0,j=a.length-1 ; i<j ; i++,j--) //Two pointer approach
		{
			/*temp=a[i];
			a[i]=a[j];
			a[j]=temp;*/
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
		}
		
	}

	public static void main(String[] args) {
	int array[]= {1,60,57,89};
	reverseArray(array);
	printArray(array);

	}

}
