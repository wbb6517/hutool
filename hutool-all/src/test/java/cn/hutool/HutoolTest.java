package cn.hutool;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;


public class HutoolTest {
	@Test
	public void getAllUtilsTest() {
		Set<Class<?>> allUtils = Hutool.getAllUtils();
		Assert.assertTrue(allUtils.size() > 0);
	}

	@Test
	public void printAllUtilsTest(){
		Hutool.printAllUtils();
	}


}
