package br.com.projectjsf.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import br.com.projectjsf.dao.DaoGenerico;
import br.com.projectjsf.model.Usuario;
import br.com.projectjsf.service.UsuarioService;



public class UsuarioServiceImpl implements UsuarioService {

	@Resource
    private DaoGenerico<Usuario, Integer> usuarioDao;

	public DaoGenerico<Usuario, Integer> getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(DaoGenerico<Usuario, Integer> usuarioDao) {
		this.usuarioDao = usuarioDao;
	}


}
