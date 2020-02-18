package array;

public class ConsecutiveLargestSum {
	static int cls(int arr[], int consecutiveLength) {
		int sum=0, max=0;
	for(int i=0; i<=arr.length-consecutiveLength; i++) {// Doubt
		sum=0;
		for(int j=i; j<i+consecutiveLength; j++) {
			sum =sum + arr[j];
			}
	if(sum>max)
		max=sum;
	
	}
	return sum;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int max= cls(a, 3);
		System.out.println(max);

	}

}
