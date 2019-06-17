package com.spring.electric.tools.models.services;

import com.spring.electric.tools.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
