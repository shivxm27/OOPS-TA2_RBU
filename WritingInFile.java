import java.io.*;
import java.io.IOException;


public class Writing
{
	public static void main(String[] args) {
	    
	    try{
	        
	    
		FileWriter writer = new FileWriter("C:\\Users\\RCOEM\\Desktop\\Java.txt");
		
		writer.write("Hello this is a test");
		
		writer.close();
		
		System.out.println("Writing Complete");
	    }
	    catch(IOException e){
	        System.out.println("Some Error Occured");
	    }
	}
}
