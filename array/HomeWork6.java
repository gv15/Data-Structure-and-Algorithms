package array;
//Find a pair in array which is equal to k
public class HomeWork6 {
static void pairSum1(int array[], int k) {
	int flag=1;
	for(int i=0; i<array.length; i++) {//O(n^2)
		for(int j=i+1; j<array.length; j++)
			if(array[i]+array[j]==k) {
				System.out.println(array[i]+","+array[j]);
				flag=0;
			}
		if(flag==0)
			break;
	}
}
public static void main(String args[]) {
	int arr[] = {8,2,5,7,1,4};
	pairSum1(arr, 9);
	
}

}
