package problema1958;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws IOException {
			Scanner leitor = new Scanner(System.in);
			double X = leitor.nextDouble();
			System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
	    }
}