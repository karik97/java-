package grooming;

public class Garbage_Collection {

	public void finalize() {
		System.out.println("clear");
	}
	public static void main(String[] args) {
		
		Garbage_Collection g = new Garbage_Collection();
		Garbage_Collection g1 = new Garbage_Collection();
		Garbage_Collection g2 = new Garbage_Collection();
		
		g=null; g1=null; g2=null;
		
		System.gc();
	
	}

}
