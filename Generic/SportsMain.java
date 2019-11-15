package Generic;

public class SportsMain {

	public static void main(String[] args) {
		FootBallPlayer ram=new FootBallPlayer(" Ram ");
		BaseBallPlayer nitesh=new BaseBallPlayer(" Nitesh ");
		
		Team<FootBallPlayer> addilet=new Team<>(" addilet ");
		addilet.addPlayer(ram);
		
		Team<BaseBallPlayer> c=new Team<>(" Prasad ");
		c.addPlayer(nitesh);
		System.out.println(addilet.numPlayers());
		
		Team<FootBallPlayer> malebourn=new Team<>(" Diwaker");
		malebourn.addPlayer(ram);
		FootBallPlayer Banks=new FootBallPlayer(" Ranchi ");
		malebourn.addPlayer(Banks);
		
		Team<FootBallPlayer> Howthron=new Team<>(" Howthron ");
		Team<FootBallPlayer> India=new Team<>(" India");
		Howthron.matchResult(India, 2, 3);
		
		System.out.println("Ranking");
		System.out.println(addilet.getName()+":"+addilet.ranking());
		System.out.println(Howthron.getName()+":"+Howthron.ranking());
		System.out.println(India.getName()+":"+India.ranking());
		
		
	}

}
