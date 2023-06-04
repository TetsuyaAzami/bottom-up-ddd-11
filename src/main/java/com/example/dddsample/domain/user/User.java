package com.example.dddsample.domain.user;

public class User {

	private UserId id;

	private UserName name;

	public User(UserId id, UserName name) {
		if (id == null)
			throw new NullPointerException();
		if (name == null)
			throw new NullPointerException();

		this.id = id;
		this.name = name;
	}

	public boolean hasSameIdentity(User other) {
		return this.id().equals(other.id());
	}

	public UserId id() {
		return this.id;
	}

	public UserName name() {
		return this.name;
	}
}
