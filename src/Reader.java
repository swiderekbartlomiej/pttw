import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public String ReadConfigFile(){
		String configLine="";
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:/Users/Rafal/Desktop/config.txt"));
			configLine = in.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return configLine;
	}
	

	

}
