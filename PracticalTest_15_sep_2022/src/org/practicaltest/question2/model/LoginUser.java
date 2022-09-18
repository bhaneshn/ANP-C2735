package org.practicaltest.question2.model;

public class LoginUser {

	private static String username;
	private static String password;
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public static String getUsername() {
		return username;
	}
	public   void setUsername(String username) {
		this.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUser [username=" + username + ", password=" + password + "]";
	}
	
	
}
