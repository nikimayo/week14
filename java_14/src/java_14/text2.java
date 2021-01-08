package java_14;
import java.io.*;
public class text2 {
	 public static void main(String[] args) throws Exception {
	        InputStream fp1= new FileInputStream("src/text2/input.txt");
	        OutputStream fp2 = new FileOutputStream("src/text2/output.txt");
	        int i;
	        while((i = fp1.read()) != -1){
	            System.out.print(i);
	            fp2.write(i);
	        }
	    }
}
