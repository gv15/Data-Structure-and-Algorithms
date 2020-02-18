package array;



public class P2NReplace {
	static void posToNegativeReplace(int a[]) {
		int i=0;
		int temp;
		int j=a.length-1;
		while(i<j) {
			if(a[i]<0) {
				i++;
				continue;
			}
			if(a[j]>0) {
				j--;
				continue;
			}
				
			if(a[i]>0 && a[j]<0) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
		}
	}
	
	}
	public static void main(String[] args) {
		int a[] = {-45,65,-25,32,-78,32};
		posToNegativeReplace(a);
		HomeWork1.printArray(a);
	}
}
