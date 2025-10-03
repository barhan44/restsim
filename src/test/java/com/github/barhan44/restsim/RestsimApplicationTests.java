package com.github.barhan44.restsim;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RestsimApplicationTests {

	@Test
	void contextLoads() {
	}

}
