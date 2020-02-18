package basicquestions;
/*You are given a list of n-1 integers and these integers are in the
range of 1 to n. There are no duplicates in the list. One of the
integers is mişsing in the list. Write an efficient code to find the
missing integer.*/

public class Problem3 {
	static int max(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
  static void missingNumApproach1(int a[]) {
	  int sum = 0,tsum=0;
	  for(int i=0;i<a.length;i++) 
		 sum+=a[i];
	  for(int i=1;i<=max(a);i++)
		  tsum+=i;
	  System.out.println(tsum-sum);
  }
  static void missingNumApproach2(int a[]) {
	  int map[]=new int[max(a)+1];
	  for(int i=0;i<a.length;i++) {
		  map[a[i]]=1;
	  }
	  for(int i=1;i<a.length;i++)
		  if(map[i]!=1)
			  System.out.println(i);
		  
	  
  }
 
	  
  
	public static void main(String[] args) {
		int list[]= {2,1,3,6,5,7};
		missingNumApproach1(list);
		missingNumApproach2(list);
		

	}

}
