import java.io.File;
import java.io.IOException;


public class Main {

    
	public static void main(String[] args) {
		File file = new File("C:\\Users\\RCOEM\\Desktop\\Java.txt");
		
		
		try{
		    if(file.createNewFile()){
		        System.out.println("File Created : " +file.getName());
		    }
		    else{
		        System.out.println("File Exists Already");
		    }
		}
		catch(IOException e){
		    System.out.println("Error Occured");
		    
		}
	}
}
