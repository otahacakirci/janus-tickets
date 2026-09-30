package dev.janus.tickets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class JanusTicketsApplicationTests {

	@Autowired
	JdbcClient jdbc;

	@Test
	void applicationStartsAndConnectsToPostgresql() {
		assertThat(jdbc.sql("SELECT 1").query(Integer.class).single()).isEqualTo(1);
	}

}
