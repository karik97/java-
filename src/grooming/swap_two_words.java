package grooming;

public class swap_two_words {

	public static void main(String[] args) {
		String a="hello";
		String b="one";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println();
		
	}

}
