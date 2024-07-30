package selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//APPROCH ; TWO CLASS USE USINF FILERREADER AND BUFFERREADER
	
		FileReader fr = new FileReader("C:\\Users\\HP\\OneDrive\\Documents\\Read.txt");
		BufferedReader br =new BufferedReader(fr);
			
	String str;
	while ((str = br.readLine())!=null);
		{System.out.println(str);}
			
	
	
	
	}

}
