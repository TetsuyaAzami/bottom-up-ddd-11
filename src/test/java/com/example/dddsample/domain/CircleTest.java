package com.example.dddsample.domain;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.example.dddsample.domain.circle.Circle;
import com.example.dddsample.domain.circle.CircleId;
import com.example.dddsample.domain.circle.CircleName;
import com.example.dddsample.domain.user.UserId;

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

	private Circle getCircle(String id, String name, List<UserId> members) {
		CircleId circleId = new CircleId(id);
		CircleName circleName = new CircleName(name);

		return new Circle(circleId, circleName, members.get(0), members);
	}

	private List<UserId> getMembers() {
		UserId user1 = new UserId(1);
		UserId user2 = new UserId(2);

		return List.of(user1, user2);
	}

	private List<UserId> getOtherMembers() {
		UserId user3 = new UserId(3);
		UserId user4 = new UserId(4);

		return List.of(user3, user4);
	}
}
