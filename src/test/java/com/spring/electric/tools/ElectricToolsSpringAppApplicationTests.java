package com.spring.electric.tools;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.electric.tools.models.dao.IClienteDAO;
import com.spring.electric.tools.models.entity.Cliente;


@RunWith(SpringRunner.class)
@DataJpaTest
public class ElectricToolsSpringAppApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private IClienteDAO clienteRepo;

	// write test cases here
	
	@Test
	public void testInsertOrden() {
		 // given
	    Cliente dani = new Cliente();
	    dani.setNombre("dani");
	    dani.setApellido("parra");
	    dani.setCedula("1094970787");
	    entityManager.persist(dani);
	    entityManager.flush();
	 
	    // when
	    Cliente found = clienteRepo.findByCedula(dani.getCedula());
	 
	    // then
	    assertThat(found.getCedula()).isEqualTo(dani.getCedula());
	}

}
