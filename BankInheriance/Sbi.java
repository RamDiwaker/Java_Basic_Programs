package BankInheriance;

public class Sbi extends Bank {
	private String AccType;
	protected double balance=50000;
	private float Withdrow;
	private float Deposit;
	public Sbi()
	{
		
	}
	public Sbi(float de,float f)
	{
		this.Deposit=de;
		this.Withdrow=f;
	}
	public Sbi(int bi,String bn,int a, String c)
	{
		super(bi,bn,a,c);
	}
	public void withdrow()
	{
		balance=balance-Withdrow;
	}
	public void deposit()
	{
		balance=balance+Deposit;
	}
		
	
	
	@Override
	public void printData() 
		// TODO Auto-generated method stub
		{
		super.printData();
		System.out.println("Total Balance="+balance);
		
			System.out.println("Account type="+AccType);
			System.out.println("Deposit Amount="+Deposit);
			System.out.println("Total Balance="+balance);
			
			System.out.println("Amount Withdrow="+Withdrow);
			System.out.println("Total Balance="+balance);
			
		}
}
