import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileinputStream {

	public static void main(String[] args) {
		
		String src="src.txt";
		String to="to2.txt";
		String  value;
		
			try {
				File srcFile=new File(src);
				File toFile=new File(to);

			DataOutputStream dataOutput=new DataOutputStream(new FileOutputStream(toFile)); 
			DataInputStream dataInput=new DataInputStream(new FileInputStream(srcFile));
			while((value=dataInput.readLine())!=null)
			{
					dataOutput.writeBytes(value);
					dataOutput.writeBytes("\n");
			}
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
				    
		
	

}
}
