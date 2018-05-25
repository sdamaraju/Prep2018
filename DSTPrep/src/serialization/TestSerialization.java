package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		TestObjectToSerialize test = new TestObjectToSerialize();
		test.testObject = "Test";
		
		FileOutputStream outFile = new FileOutputStream("C:\\Users\\damas\\Desktop\\Test.txt");
		ObjectOutputStream outStream = new ObjectOutputStream(outFile);
		outStream.writeObject(test);
		
		FileInputStream in = new FileInputStream("C:\\Users\\damas\\Desktop\\Test.txt");
		ObjectInputStream inStream = new ObjectInputStream(in);
		TestObjectToSerialize a = (TestObjectToSerialize)inStream.readObject();
		System.out.println( "Post Serialize " + a.testObject);

	}

}
