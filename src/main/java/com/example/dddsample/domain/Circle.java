package com.example.dddsample.domain;

import java.util.ArrayList;
import java.util.List;
import com.example.dddsample.exception.circle.CircleCapacityOverException;


public class Circle {
	private CircleId id;

	private CircleName name;

	private User owner;

	private List<User> members;

	private Integer MAX_NUMBER_OF_CIRCLE_MEMBER = 30;

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

	public Circle join(User newMember) {
		if (!isNewMemberJoinable()) throw new CircleCapacityOverException();

		List<User> withNewMember = new ArrayList<>(this.members());
		withNewMember.add(newMember);

		return new Circle(this.id, this.name, this.owner, withNewMember);
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

	public boolean isNewMemberJoinable() {
		return numberOfMembersWithOwner() < MAX_NUMBER_OF_CIRCLE_MEMBER;
	}

	private int numberOfMembersWithOwner() {
		return members().size() + 1;
	}
}
