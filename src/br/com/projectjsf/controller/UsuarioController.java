package br.com.projectjsf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.projectjsf.model.Usuario;
import br.com.projectjsf.service.UsuarioService;

@Controller(value = "usuarioController")
@Scope(value = "request")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
