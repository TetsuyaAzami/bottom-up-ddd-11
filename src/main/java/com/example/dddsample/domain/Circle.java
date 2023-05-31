package com.example.dddsample.domain;

import java.util.ArrayList;
import java.util.List;

public class Circle {

	private CircleId id;

	private CircleName name;

	private User owner;

	private List<User> members;

	public Circle(CircleId id, CircleName name, User owner, List<User> members) {
		if (id == null)
			throw new NullPointerException();
		if (name == null)
			throw new NullPointerException();
		if (owner == null)
			throw new NullPointerException();
		if (members == null)
			throw new NullPointerException();

		this.id = id;
		this.name = name;
		this.owner = owner;
		this.members = new ArrayList<>(members);
	}

	public boolean hasSameIdentity(Circle other) {
		return this.id().equals(other.id());
	}

	public CircleId id() {
		return this.id;
	}

	public CircleName name() {
		return this.name;
	}

	public User owner() {
		return this.owner;
	}

	public List<User> members() {
		return new ArrayList<>(this.members);
	}
}
