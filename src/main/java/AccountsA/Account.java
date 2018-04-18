package AccountsA;

public class Account {
	
	private String firstName;
	private String lastName;
	private String accountNo;


public Account(String firstName, String lastName, String accountNo) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.accountNo = accountNo;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAccountNo() {
	return accountNo;
}

public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}

public String toString() {
	return "First Name: " + firstName + "Last Name: " + lastName + "AccountNo: " + accountNo;
}
}

