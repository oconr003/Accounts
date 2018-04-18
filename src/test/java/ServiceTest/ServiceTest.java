package ServiceTest;

import org.junit.Before;
import org.junit.Test;

import AccountsA.Account;
import AccountsA.Service;
import UTIL.JSONUtil;
import junit.framework.Assert;

public class ServiceTest {
	private Service service;
	private Account joeBloggs;
	private Account janeBloggs;
	private JSONUtil util;

	@Before
	public void init() {
		service = new Service();
		joeBloggs = new Account("Joe", "Bloggs", "123");
		janeBloggs = new Account("Jane", "Bloggs", "124");
		util = new JSONUtil();
	}
	
	@Test
	public void addAcountTest() {
		service.addAccount("Joe", "Bloggs", "123");
		Assert.assertEquals(service.getAccountDB().size(), 1);
	}
	
	@Test
	public void jsonConversionTest() {
		String emptyMap = util.getJSONForObject(service.getAccountDB());
		Assert.assertEquals("{}", emptyMap);
		
	}
}
