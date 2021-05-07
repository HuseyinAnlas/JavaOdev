package eTrade.business.verification;

import eTrade.entities.concretes.User;

public class EmailVerification implements Verification{

	public EmailVerification(boolean result, User user) {

		if (result) {

			System.out.println("Lütfen e-posta adresinize gelen doðrulama postasını onaylayınız");

			accept(user);
		}

	}

	public void accept(User user) {

		System.out.println("Tebrikler " + user.getFirstName() + ", E-posta adresin başarıyla onaylandı");
	
	}
}
