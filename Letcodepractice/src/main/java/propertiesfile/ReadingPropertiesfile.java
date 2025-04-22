package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//specifying the location of properties file
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Loading the Properties file
		Properties property= new Properties();
		property.load(file);
		
		//Reading the data from properties file 

		String applicaturl=property.getProperty("appurl");
		String emailid=property.getProperty("email");
		String pwd=property.getProperty("password");
		String ordid=property.getProperty("orderid");
		String cstid=property.getProperty("customerid");
		
		System.out.println(applicaturl+" "+emailid+" "+pwd+" "+ordid+" "+cstid);
		
		//Reading all the keys from properties file
		//Approach one
		Set<String>keynames= property.stringPropertyNames();
		System.out.println(keynames);
		//Approach two
		Set<Object> key=property.keySet();
		System.out.println(key);
		//Reading all the values from properties file
		Collection<Object> value=property.values();
		System.out.println(value);
		file.close();
	}

}
