package java_14;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class text1 {
	public static void main(String[] args) throws FileNotFoundException {
        java.io.File fp1= new java.io.File("src/text1/input.txt");
        java.io.File fp2 = new java.io.File("src/text1/output.txt");
        try(java.io.PrintWriter output = new java.io.PrintWriter(fp1)){
            output.println("Hello World");
        }
        Scanner input = new Scanner(fp1);
        try (java.io.PrintWriter output1 = new java.io.PrintWriter(fp2);){
            while(input.hasNext()){
                String x = input.nextLine();
                output1.println(x);
                System.out.println(x);
            }
        }

        input.close();
}
}