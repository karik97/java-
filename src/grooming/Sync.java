package grooming;

public class Sync {

	public static void main(String[] args) {
		new Thread(new sim()) .start();
		new Thread(new sim1()) .start();
	}
}
class sim extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
class sim1 extends Thread{
	public void run() {
		for(int i=11; i<19; i++) {
			System.out.println(i);
		}
	}
}