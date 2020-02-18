package basicquestions;
import java.util.Scanner;
/*Shaggy has a frog Akki. Akki is very hungry
and Shaggy decides to feed it by playing a
inte game. Akki is a special frog which can
jump os far as it wants but has a special
pattern He starts at the point 0.
in his first turn, he can make a jump of 1 unit.
Now for all consequent turns, If the frog is
currently at a distance x (from the start), his
jump will take him x units forward. Given a
leaf at a distance N, you have to find if the
frog can reach that leaf or not*/

public class problem2 {
	private static void isEatLeaf(int distance) {
		int flag=0;
		if(distance==0) {
			System.out.println("true");
			flag=1;
		}
		else {
			for(int i=0;i<=distance;i++) {
				if(distance==Math.pow(2, i)) {
					System.out.println("true");
					flag=1;
				}
			}
		}
		if(flag==0)
		System.out.println("false");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int distances[]=new int[25];
		int n=s.nextInt();
		for(int i=0;i<n;i++)
			distances[i]=s.nextInt();
		for(int i=0;i<n;i++) {
			isEatLeaf(distances[i]);
			s.close();
			
		}
	}

}
