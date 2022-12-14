package util;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class loadFile {

	public static ArrayList<String> load(String fileName) {
		ArrayList<String> fileInput = new ArrayList<>();
		String str;
		
		try (RandomAccessFile file = new RandomAccessFile("/home/hotx/Documents/advent/" + fileName, "r")) {
	            
			while ((str = file.readLine()) != null){
				fileInput.add(str);
	        }
	        file.close();
	           
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    	
	    	return fileInput;
	    }  
}
