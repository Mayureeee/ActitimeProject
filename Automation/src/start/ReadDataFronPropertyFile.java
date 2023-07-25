package start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFronPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./Test Data/commondata.property");
Properties p=new Properties();
p.load(fis);
String value = p.getProperty("browser");
String url = p.getProperty("url");
String un = p.getProperty("username");
String pw = p.getProperty("password");
System.out.println(value);
System.out.println(url);
System.out.println(un);
System.out.println(pw);
	}

}
