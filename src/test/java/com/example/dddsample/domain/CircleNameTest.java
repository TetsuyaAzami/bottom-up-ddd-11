package com.example.dddsample.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import com.example.dddsample.domain.circle.CircleName;

public class CircleNameTest {

	@Test
	void 等価性_同じオブジェクト() {
		CircleName circleName = new CircleName("サークル");

		assertThat(circleName).isEqualTo(circleName);
		assertThat(circleName.hashCode()).isEqualTo(circleName.hashCode());
	}

	@Test
	void 等価性_異なるオブジェクトで同じサークル名() {
		CircleName circleName = new CircleName("サークル");
		CircleName circleName2 = new CircleName(circleName.value());

		assertThat(circleName).isEqualTo(circleName2);
		assertThat(circleName.hashCode()).isEqualTo(circleName2.hashCode());
	}

	@Test
	void 等価性_違うサークル名() {
		CircleName circleName = new CircleName("サークル");
		CircleName circleName2 = new CircleName("サークル2");

		assertThat(circleName).isNotEqualTo(circleName2);
		assertThat(circleName.hashCode()).isNotEqualTo(circleName2.hashCode());
	}
}
