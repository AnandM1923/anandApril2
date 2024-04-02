package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilePath {

	public static void main(String[] args) throws FileNotFoundException {
	//System.out.println(System.getProperty("C:\\Users\\margo\\eclipse-workspace2\\AprilPOM2024\\Properties\\prop.properties"));
	System.out.println(System.getProperty("user.dir") + "\\Properties\\prop.properties");
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\Properties\\prop.properties");
	FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\Properties\\prop.properties");
	System.out.println(fis);
	System.out.println(fis1);
	}

}
