package array;
//Rotate an array
public class HomeWork2 {
	static void approachI(int a[], int rotatefactor) { //O(n^2)
		for(int i=0; i<rotatefactor; i++) {
			int temp=a[0];
			for(int j=0; j<a.length-1; j++)
				a[j]=a[j+1];
			a[a.length-1]=temp;
			}
			
			
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		approachI(a,2);
		HomeWork1.printArray(a);

	}

}