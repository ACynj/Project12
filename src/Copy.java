import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.transform.OutputKeys;

public class Copy {

	public static void main(String[] args) {
		PrintWriter output = null;
		String srcTxt="src.txt";
		String toTxt="to.txt";
		Scanner input=null;
		try {
			File srcFile=new File(srcTxt);
			File  file=new File(toTxt);
			 input=new Scanner(srcFile);
			 output=new PrintWriter(file);
			 while(input.hasNextLine()) {
				 output.println(input.nextLine());
			 }
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			output.close();
		}
	}

}
