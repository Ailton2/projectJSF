package br.com.projectjsf.service;

import br.com.projectjsf.model.Usuario;

public interface UsuarioService {

	public Usuario buscaPorLoginESenha(String login, String senha);
	public Usuario buscaPorEmail(String email);
	public Usuario atualizaUsuario(Usuario usuario);
	public Usuario salvar(Usuario usuario);
}
