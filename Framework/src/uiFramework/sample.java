package uiFramework;

import org.junit.Test;

import common.ReadPropertyFile;

public class sample {

	@Test
	public void readConfig() throws Exception{
		ReadPropertyFile configFile = new ReadPropertyFile();
		System.out.println(configFile.Browser());
	}
}
