package AccountsA;

import java.util.Scanner;
import com.google.gson.Gson;
import AccountsA.Service;

public class Runner {
	
	
	public static void main( String[] args ) {
		
		Service service = new Service();
		
		service.addAccount("Rach", "OConnell", "001");
		service.addAccount("Joe", "Biggs", "002");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter user key to get info");
		int userInput = scanner.nextInt();
		service.userDetails(userInput);
		
		Gson gson = new Gson();
		String json = gson.toJson(service.accountDB);
		System.out.println(json);

	}
}

