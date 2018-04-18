package AccountsA;

import java.util.HashMap;
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

		public Object getAccountDB() {
			// TODO Auto-generated method stub
			return accountDB;
		}


}