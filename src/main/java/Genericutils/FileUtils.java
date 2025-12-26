package Genericutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils 
{
	/**
	 * this method is used to read the data for file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathConstants.filepath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);//key can be browser or url or username or password
		return value;
	}

}
