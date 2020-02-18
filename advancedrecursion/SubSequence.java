package advancedrecursion;
import java.util.ArrayList;
public class SubSequence {
	static ArrayList<String> subSequence(String string){
		if(string.length()==0)
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(" ");
			return list;
		}
		else
		{
			ArrayList<String> list = new ArrayList<>();
			ArrayList<String> result = new ArrayList<>();
			char temp =  string.charAt(0);
			if(string.length() == 0)
			 list = subSequence(string);
			else
				list = subSequence(string.substring(1));
			for(int i=0 ; i<list.size() ; i++)
			{
				result.add(list.get(i));
				result.add(list.get(i)+temp);
			}
			return result;
			
			
			
		}
	}
	public static void main(String[] args) {
		String string = "abc";
		ArrayList<String> list = subSequence(string);
		/*
		 * for(int i=0; i<list.size() ; i++) System.out.println(list.get(i));
		 */		
		System.out.println(list);
	}
}
