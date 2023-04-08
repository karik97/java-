package grooming;

class demo extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class demo1 extends Thread{
	public void run() {
		for(int i=20; i<30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Non_Sync {

	public static void main(String[] args) {
		
		Thread th = new Thread(new demo());
		th.start();
		Thread th1 = new Thread(new demo1());
        th1.start(); 
	}

}
