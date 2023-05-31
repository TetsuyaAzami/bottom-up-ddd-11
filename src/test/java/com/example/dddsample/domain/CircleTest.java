package com.example.dddsample.domain;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CircleTest {

	@Test
	void 等価性_同じオブジェクト() {
		Circle circle = getCircle("1", "サークル1", getMembers());

		assertThat(circle.hasSameIdentity(circle)).isTrue();
	}

	@Test
	void 等価性_同じid_他の属性が全て異なる() {
		Circle circle = getCircle("1", "サークル1", getMembers());
		Circle circle2 = getCircle("1", "サークル1だったもの", getOtherMembers());

		assertThat(circle.hasSameIdentity(circle2)).isTrue();
	}

	private Circle getCircle(String id, String name, List<User> members) {
		CircleId circleId = new CircleId(id);
		CircleName circleName = new CircleName(name);

		return new Circle(circleId, circleName, members.get(0), members);
	}

	private List<User> getMembers() {
		User user1 = new User(new UserId(1), new UserName("ユーザ名1"));
		User user2 = new User(new UserId(2), new UserName("ユーザ名2"));

		return List.of(user1, user2);
	}

	private List<User> getOtherMembers() {
		User user3 = new User(new UserId(3), new UserName("ユーザ名3"));
		User user4 = new User(new UserId(4), new UserName("ユーザ名4"));

		return List.of(user3, user4);
	}
}
