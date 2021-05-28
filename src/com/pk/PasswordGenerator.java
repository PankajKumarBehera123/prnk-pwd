package com.pk;

import com.pk.exception.InvalidMobileNumberException;
import com.pk.exception.InvalidSpecialCharacterException;
import com.pk.exception.InvalidUserNameException;

public class PasswordGenerator {

	public static String generatePwd(String mobNo, String name, char specialChar) {
		StringBuilder pwd = null;
		if (mobNo == null || mobNo.length() != 10 || mobNo.contains(" ")) {
			throw new InvalidMobileNumberException("Please Enter 10 digits mobile number..!!");
		}

		pwd = new StringBuilder();
		for (int i = mobNo.length() - 1; i >= 6; i--) {
			pwd.append(mobNo.charAt(i));
		}
		pwd.reverse();

		if (specialChar == '#' || specialChar == '$') {
			pwd.append(specialChar);
		} else {
			throw new InvalidSpecialCharacterException(specialChar + " is not allowed, Pease Enter either # or $ ");
		}

		if (name == null || name.length() < 3 || name.contains(" ")) {
			throw new InvalidUserNameException("Please enter valid name, which must have atleast 3 or more characters");
		}
		for (int i = 0; i < 3; i++) {
			pwd.append(name.charAt(i));
		}
		return pwd.toString();

	}

	public static void main(String[] args) {
		String pwd = generatePwd("8789456518", "priyanka", '#');
		System.out.println("Generated Password is :" + pwd);
	}

}
