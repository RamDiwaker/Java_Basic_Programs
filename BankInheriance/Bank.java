package BankInheriance;

public class Bank {
	private int BankId;
	private String Bname;
	private int Acc;
	private String Cname;
	public Bank()
	{
	}
		
	public Bank(int bi,String bn,int a,String c)
	{
		this.BankId=bi;
		this.Bname=bn;
		this.Acc=a;
		this.Cname=c;
	}
	public void printData() 
		// TODO Auto-generated method stub
		{
			System.out.println("Bank ID ="+BankId);
			System.out.println("Bank Area Name"+Bname);
			System.out.println("Account no.="+Acc);
			System.out.println("Customer name="+Cname);
			
		}

	
}
