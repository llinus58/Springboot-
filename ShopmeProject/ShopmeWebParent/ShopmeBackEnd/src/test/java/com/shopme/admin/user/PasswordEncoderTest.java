package com.shopme.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
	@Test
	public void testEncodePassword() {
		BCryptPasswordEncoder passwordEnconder = new BCryptPasswordEncoder();
		
		String rawPassword = "nam2020";
		String encodedPassword = passwordEnconder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		boolean matches = passwordEnconder.matches(rawPassword, encodedPassword);
		
		assertThat(matches).isTrue();
	}
}
