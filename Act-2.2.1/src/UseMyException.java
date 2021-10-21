import java.util.Scanner;
public class UseMyException {
    
	public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
	 int x ;
     System.out.println("Saisir un nombre entre 10 et 30 inclus:");
     x =scanner.nextInt();  
     try {
    	    if ( x < 10 || x >30){ 
    	 	   throw new Exception ("Exception in thread \"main\" Exception: The value is not in the allowed interval");
     }
     }	
    	    catch (Exception E) {
    		E.printStackTrace();
     }
	}
}
