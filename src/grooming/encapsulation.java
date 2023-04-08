package grooming;

public class encapsulation {

	private String pwd="kartik";
	public void getpwd()
	{
		this.pwd=pwd;
		
	}
	public String setpwd(String pwd)
	{
		return pwd;
	}
	public static void main(String[] args) {
	
		encapsulation e=new encapsulation();
		System.out.println(e.pwd);
		System.out.println(e.setpwd("karti"));
	}
}
