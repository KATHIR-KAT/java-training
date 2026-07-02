  import java.util.*;
  class dulicate{
	  public static void main(String[] args){
		  
		  System.out.print("Enter the number of elements:");
		  Scanner sc= new Scanner(System.in);
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  HashSet<Integer> set1 = new HashSet<>();
		  for(int i=0;i<n;i++){
			  int val=sc.nextInt();
			  //arr[i]=val;
			  set1.add(val);
		  }
		  for(int i:set1){
			  System.out.println(i);
		  }
		  
	  }
  }