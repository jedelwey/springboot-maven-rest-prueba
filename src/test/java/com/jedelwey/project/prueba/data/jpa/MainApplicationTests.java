package com.jedelwey.project.prueba.data.jpa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jedelwey.project.prueba.MainApplication;

/**
 * The Class MainApplicationTests.
 */
@SpringBootTest
public class MainApplicationTests {

	/**
	 * Context loads.
	 */
	@Test
	public void contextLoads() {
		MainApplication.main(new String[] {});
		assertTrue(true);
	}
	
}
