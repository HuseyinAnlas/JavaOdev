package eTrade.business.validationRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.entities.concretes.User;

public class RegisterValidator implements Validator{

	public RegisterValidator(User user) throws Exception {

		checkIfPasswordThanSix(user.getPassword());

		checkIfEmailForm(user.getEmail());

		checkIfFirstNameThanTwo(user.getFirstName());

		checkIfLastNameThanTwo(user.getLastName());

	}

	public void checkIfPasswordThanSix(String password) throws Exception {

		if (password.length() < 6) {

			throw new Exception("Parola en az 6 haneli olmalıdır");

		}

	}

	public void checkIfEmailForm(String email) throws Exception {

		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {

			throw new Exception("E-Posta formatýnda olmalıdır");

		}

	}

	public void checkIfFirstNameThanTwo(String firstName) throws Exception {

		if (firstName.length() < 2) {

			throw new Exception("Ýsim en az 2 karakterden oluşmalıdır");

		}

	}

	public void checkIfLastNameThanTwo(String lastName) throws Exception {

		if (lastName.length() < 2) {

			throw new Exception("Soyisim en az 2 karakterden oluşmalıdır");

		}

	}
}
