import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWithoutExceptions {

	public static void main(String[] args) throws IOException {
		
		
			
		
	    FileReader in =new FileReader("C:/test/data.txt");
	    BufferedReader br = new BufferedReader(in);
        int max = -1 ;
        try {
        String line = br.readLine();	
        while (line != null) { 
        	int n= Integer.parseInt(line);
        	if (n > max) max = n;
            line = br.readLine();
        }
		}
        catch (FileNotFoundException c) {
            System.out.println("Interception FileNotFoundException "+c.getLocalizedMessage());
        }    	
		
        catch (NumberFormatException a) {
            System.out.println("Interception NumberFormatException "+a.getLocalizedMessage());
        }
        catch(IOException b) {
        	System.out.println("Interception IOException"+b.getLocalizedMessage());
		}
        
        
        
        finally {
        System.out.println("Maximum = " + max);
        }	
		
	}

}
