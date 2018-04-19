package AccountsA;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Service {
	
		static int num = 1;
		Map<Integer, Account> accountDB;
		
		public Service() {
			accountDB = new HashMap<Integer, Account>();
		}
		
		public void addAccount(String firstName, String lastName, String accountNo) {
			Account account = new Account(firstName, lastName, accountNo);
			accountDB.put(num, account);
			num++;
			System.out.println(firstName + "" + lastName + " added to database. AccountNo: " + accountNo);
		}
		
		public void getAccount(Account account) {
			account.toString();
		}
		
		public void removeAccount(Integer accountToRemove) {
			boolean accountExists = accountDB.containsKey(accountToRemove);
			if (accountExists) {
				accountDB.remove(accountToRemove);
			}
		}


		public void userDetails(int userInput) {
			Set<Entry<Integer, Account>> hashSet=accountDB.entrySet();
			for(Entry entry:hashSet) {
				int key = (Integer) entry.getKey(); 
					if (key==userInput) {
					System.out.println(key+ "," + entry.getValue());
				}
			
			}
		}
// Need to return map not object!
		public Map getAccountDB() {
			return accountDB;
		}

		public int findUsers(String firstName, HashMap<Integer, Account> accountDB) {
			int count = 0;
			for (Account account : accountDB.values()) {
				if (account.getFirstName().equals(firstName)) {
					count++;
					System.out.println("Number of " + firstName + " :" + count);
				}
			} return count;
		}
		
		
		public void displayUsers() {
			Set entrySet = accountDB.entrySet();
			Iterator it = entrySet.iterator();
			
			while(it.hasNext()) {
				Map.Entry me = (Map.Entry)it.next();
				System.out.println("Key: " + me.getKey() + "Value: " + me.getValue());	
			}
		}
		
		public int findUsers2 (String firstName, Map<Integer, Account> accountDB) {
			return (int)accountDB.values().stream().filter(i -> firstName.equals(i.getFirstName())).count();
		}
}