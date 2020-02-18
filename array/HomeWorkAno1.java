package array;
//all negative must appear before positive in the array
public class HomeWorkAno1 {
	static void reArrange(int a[]) {
		int temp;
		/*
		 * for(int i=0, j=a.length-1; i<j; i++,j--) // Two-Pointer approach if(a[i]>0 &&
		 * a[j]<0) { temp=a[i]; a[i]=a[j]; a[j]=temp; }
		 */
		int i=0, j=a.length-1;
		
		while(i<j) {
			if(a[i]>0 && a[j]<0) { 
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				}
			

		}
	}
	

	public static void main(String[] args) {
		int a[]= {63, -64, -30, -65 ,66 , 31};
		reArrange(a);
		HomeWork1.printArray(a);
	}

}
