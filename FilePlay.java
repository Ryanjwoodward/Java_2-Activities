package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePlay {
	
	

	private static void copyFile(String inFile, String outFile) throws IOException, FileNotFoundException {
		
		BufferedWriter out = null;
		BufferedReader in = null;
		
		in = new BufferedReader(new FileReader(inFile));
		out = new BufferedWriter(new FileWriter(outFile));
		
		
		String line;
		while((line = in.readLine()) != null) {
			
			String[] tokens = line.split("\\|");
			out.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
			
		
		}
		in.close();
		out.close();
		
	}

	public static void main(String[]args) throws IOException {
		
		
	try {
		FilePlay.copyFile("in_4-1d.txt","/home/_ryan/Desktop/School_GCU/CST239/workspaceCST-209/topic4-1d/out_4-1d.txt");
		
	}catch(FileNotFoundException e) {
		
		e.printStackTrace();
		System.out.println("File could not be opened.");
	}catch(IOException e){
		e.printStackTrace();
		System.out.println("File I/O error");
	}
		
	
	}
	
	
	
}//FilePlay	break;


/*






*/