package ServiceTest;

import java.util.HashMap;

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
	private Account joeSmith;
	private JSONUtil util;
	private HashMap testDB;
	

	@Before
	public void init() {
		service = new Service();
		joeBloggs = new Account("Joe", "Bloggs", "123");
		janeBloggs = new Account("Jane", "Bloggs", "124");
		joeSmith = new Account("Joe", "smith", "125");
		util = new JSONUtil();
		this.testDB = new HashMap<Integer, Account>();
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
	
	@Test
	public void findUsersTest() {
		HashMap testDB = new HashMap<Integer, Account>();
		service.addAccount("Joe", "Bloggs", "123");
		service.addAccount("Jane", "Bloggs", "123");
		service.addAccount("Joe", "Smith", "123");
		int numberOfJoes = 2;
		Assert.assertEquals(numberOfJoes, service.findUsers("Joe", testDB));
	}
	
	@Test
	public void findUsers2Test() {
		HashMap testDB = new HashMap<Integer, Account>();
		service.addAccount("Joe", "Bloggs", "123");
		service.addAccount("Jane", "Bloggs", "123");
		service.addAccount("Joe", "Smith", "123");
		int numberOfJoes = 2;
		Assert.assertEquals(numberOfJoes, service.findUsers2("Joe", testDB));
	}
}
