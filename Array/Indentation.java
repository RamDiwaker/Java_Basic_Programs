package Array;

public class Indentation {
	
	public static void main (String[] args) {

		String input = "public class PrettyPrint { public static void main(String args[]) { System.out.println(\"Hello World\"); String input = \"This is a sample code\"; System.out.println(Indent(input)); } public static String Indent(String input) { return \"Indented: \" + input; } }";
		   String Blank="     ";
		   String val="";
		   int count=0;
		 for(int i=0;i<input.length();i++)
		 {
			 if(input.charAt(i)!='}')
		    	 val+=input.charAt(i);
		     
		     if(input.charAt(i)=='{'){
		         count++;
		         int x=count;
		         val+="\n";
		         while(x-->0)
		        	 val+=Blank;
		         
		     }
		     
		     else if(input.charAt(i)=='}')
		     {
		         int x=count;
		         val+="\n";
		         while(x-->0){
		        	 val+=Blank;
		         x--;
		         }
		         val+="}";
		         count--;
		     }
		     
		     else if(input.charAt(i)==';')
		    	 val+="\n"+Blank;
		 }
		 
		 for(int i=0;i<val.length();i++)
		 System.out.print(val.charAt(i));
		}
		}


