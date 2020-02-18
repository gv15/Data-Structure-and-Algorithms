package array;
//ZigZag array
public class HomeWork3 {
static void zigZagArray(int array[]){
	boolean flag = false;
	int temp;
	for(int i=0; i<array.length-1 ; i++) {
		if(!flag) {
		if(array[i]>array[i+1]) {
			temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
			}
		}
		
			if(flag) {
				if(array[i]<array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					}
			}

		flag=!flag;
		}
				
		}

		
	

public static void main (String args[]) {
	int a[]= {22,3,6,9,6,5};
	zigZagArray(a);
	HomeWork1.printArray(a);
}
}
