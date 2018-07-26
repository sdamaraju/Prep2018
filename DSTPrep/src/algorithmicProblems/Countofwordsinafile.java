package algorithmicProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Countofwordsinafile {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader(new File("C:\\Users\\damas\\Desktop\\test.txt"));
		BufferedReader br = new BufferedReader(f);
		String array[] = {};
		String s= br.readLine();
		int totalCount = 0;
		while(s!=null){
			System.out.println(s);
			array = s.split(" ");
			
			totalCount = totalCount+array.length;
			System.out.println(totalCount);
			s=br.readLine();
		}
		System.out.println(totalCount);
		
	}

}
