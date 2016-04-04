package com.sdi.model;

import java.io.Serializable;

public class User implements Serializable {
	private String login;
	private String name;
	public User(String login, String name)  { 
		this.login = login;
		this.name = name;
	}
}
