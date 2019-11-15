package BankInheriance;

public class BankTest {

	public static void main(String[] args) {
		Bank s2=new Bank(50005,"SBI",1111,"Ram");
		s2.printData();
		Sbi s=new Sbi(1000,2000);
		s.deposit();
		s.withdrow();
		
		s.printData();
		//Sbi s1=new Sbi(123,"SAVING",1111,"RAM");
	//	s1.printData();
		// TODO Auto-generated method stub

	}

}
