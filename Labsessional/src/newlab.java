import java.util.*;
public class newlab {

	public static void main(String[] args){

		//Scanner in = new Scanner(System.in);

		 /*
		  System.out.println("Enter a string!"); 
		 String givenString = in.nextLine();

		     char givenChar = in.next().charAt(0);
		
		    for (int i = 0; i < givenString.length(); i++) {

		//      char charAtI = givenString.charAt(i);
		    	  System.out.println("character At index 3 is ="+givenString.charAt(i);
		     // if (charAtI == givenChar){
		    	//  System.out.println("character At index 3 is ="+givenString.charAt(i)
		   //   }
		    }

       //     String st="nadeem ";
	//	   System.out.println("character At index 3 is ="+st.charAt(3));
		   
	*/	 
		
	}

public static int getIndex(String s, char ch){
	
	for(int i=0; i<s.length(); i++){
		if(s.charAt(i)==ch){
			return i;
	}
	}
	return -1;
}
}



	

		  
		
		
	


