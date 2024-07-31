package com.example.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo3.model.Departement;
import com.example.demo3.service.DepartementService;

@SpringBootTest
class Demo3ApplicationTests {

	@Autowired
	private DepartementService departementService;
	@Test
	void post() {
		// Insert
		Departement departement = new Departement();
		departement.setDepartementName("Bali");
		
		// ACT
		Boolean result = departementService.save(departement);

		// Assert
		assertEquals(true, result);

		
	}
	

}
