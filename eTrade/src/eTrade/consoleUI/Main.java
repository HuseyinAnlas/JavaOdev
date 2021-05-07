package eTrade.consoleUI;

import eTrade.business.auth.DefaultAuthorization;
import eTrade.business.concretes.AuthorizationManager;
import eTrade.business.concretes.UserManager;
import eTrade.dataAccess.concretes.InMemoryUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"H�seyin", "Anla�", "huseyin@gmail.com", "123456");

		AuthorizationManager authorizationManager = new AuthorizationManager(
				new DefaultAuthorization(new UserManager(new InMemoryUserDao())));

		authorizationManager.register(user);

		authorizationManager.login("huseyin@gmail.com", "123456");
	}

}
