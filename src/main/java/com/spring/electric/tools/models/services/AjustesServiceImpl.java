package com.spring.electric.tools.models.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.electric.tools.models.dao.IAjustesDAO;
import com.spring.electric.tools.models.entity.Ajustes;

@Service
public class AjustesServiceImpl implements AjustesService{

	@Autowired
	private IAjustesDAO ajustesDAO;
	
	/**
	 * Retorna la fila de ajustes existentes, si no entonces la crea
	 */
	@Override
	public Ajustes getAjuste() {
		Optional<Ajustes> opAjustes = ajustesDAO.findById(1L);
		if (opAjustes.isPresent()) {
			return opAjustes.get();
		}else {
			Ajustes primerAjuste = new Ajustes();
			primerAjuste.setId(1L);
			save(primerAjuste);
			return ajustesDAO.findById(1L).get();
		}
	}

	@Override
	public Ajustes save(Ajustes ajuste) {
		ajuste.setId(1L);
		return ajustesDAO.save(ajuste);
	}
}
