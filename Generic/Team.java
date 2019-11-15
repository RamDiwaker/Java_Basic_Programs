package Generic;

import java.util.ArrayList;

public class Team<T extends Player> {
private String name;
int played=0;
int won=0;
int loss=0;
int tied=0;
private ArrayList<T> members=new ArrayList<>();
public Team(String name){
this.name=name;
}
public String getName(){
return name;
}
public boolean addPlayer(T player){
if(members.contains(player)){
System.out.println( player.getName() + "is already on this team  ");
return false;
}
else{
	members.add(player);
System.out.println(player.getName()+"picked for team  "+this.name);
return true;
}
}
public void setName(String name) {
	this.name = name;
}
public int numPlayers(){
return this.members.size();
}
public void matchResult(Team opponent,int ourScoure,int theirScore){
String message = null;
if(ourScoure>theirScore){
won++;
message=" beat ";
}
else if(ourScoure==theirScore){
tied++;
message=" Tied with ";
}
else{
loss++;
message=" losed to ";
}
played++;
if(opponent!=null){
	System.out.println(this.getName()+ message +opponent.getName());
opponent.matchResult(null,theirScore,ourScoure);
}
}
public int ranking(){
return(won*2)*tied;
}
}
