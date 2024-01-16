package StringHandelingApache.firstStringHandeling;

public class Traversestring {

	public static void main(String[] args) {
		String s="my name is deepak";
		String[] s1=s.split(" ");    ////for word by word by using space
		int L=s.length();
		for(int i=0;i<L;i=i+1)
		{
			//System.out.println(s.charAt(i));//for Character by character
			System.out.println(s1[i]);   //for word by word
		}

	}

}
