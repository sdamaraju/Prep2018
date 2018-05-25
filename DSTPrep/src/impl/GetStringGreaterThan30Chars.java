package impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetStringGreaterThan30Chars {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\damas\\Desktop\\SR-C25056\\testSQLError.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		int lineNum = 0;
		while(line!=null){
		//	System.out.println(line);
			lineNum++;
			String eachWordArray[] = line.split(" ");
			for(int i=0;i<eachWordArray.length;i++){
				String eachWord2[] = eachWordArray[i].split(","); 
				for(int j=0;j<eachWord2.length;j++)
					if(eachWord2[j].length() >=33){
						System.out.println(lineNum);
						System.out.println(eachWord2[j]);
				}
			}
			line = br.readLine();
		}

	}

}
