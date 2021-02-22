package br.com.projectjsf.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.projectjsf.model.Usuario;

@Controller(value = "usuarioController")
@Scope(value = "request")
public class UsuarioController {
	
	
	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
