package selenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Javafirts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Documents\\test.txt");
BufferedWriter bw =new BufferedWriter(fw);
	
	bw.write("atiq");
	bw.write("i belongs in aara and shakti sir");
bw.close();
	System.out.println("filza");
	}

}
