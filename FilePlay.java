package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePlay {
	
	

	private static int copyFile(String inFile, String outFile) throws IOException  {
		
		BufferedWriter out = null;
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(inFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			out = new BufferedWriter(new FileWriter(outFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int c;
		while((c = in.read()) != -1) {
			
			
			try {
				out.write(c);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				return -1;
			}catch(IOException e) {
				e.printStackTrace();
				return -2;
			}
			
		
		}
		in.close();
		out.close();
		return 0;
	}

	public static void main(String[]args) throws IOException {
		
	int err = FilePlay.copyFile("people.txt","newOutput.txt");
	
		switch(err) {
		
		case 0: System.out.println("File was copied Successfully! Wahoo!");
			break;
		case -1: System.out.println("File Could not be Opened! Drat!");
			break;
		case -2:System.out.println("File I/O ERROR! Dag Nabbit!");
			break;
		}
	
	}
	
	
	
}//FilePlay

/*






*/