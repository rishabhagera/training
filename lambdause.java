package lambd;

public class lambdause {

	interface calc{
		void getSum();
	}
	private interface bank
	{
		int getDeposite(int amt,String name);
	}
	public static void main(String[] args)
	{
		calc c1= ()-> System.out.println(45+55);
		c1.getSum();
		
		bank b =(int bal, String name)->{
			int k = bal+5000;
			System.out.println("your balance is : "+k);
			return k;
		};
		int r = b.getDeposite(3000,"Rishabh");
	}
}
