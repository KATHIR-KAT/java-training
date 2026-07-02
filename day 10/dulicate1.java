  import java.util.*;
  class dulicate1{
	  public static void main(String[] args){
		  
		  System.out.print("Enter the string:");
		  Scanner sc= new Scanner(System.in);
		  String n=sc.nextLine();
		 
		  LinkedHashSet<Character> set1 = new LinkedHashSet<>();
		  for(int i=0;i<n.length();i++){
			  char ca = n.charAt(i);
			  set1.add(ca);
			  
		  }
		  for(char i:set1){
			  System.out.print(i);
		  }
		  
	  }
  }