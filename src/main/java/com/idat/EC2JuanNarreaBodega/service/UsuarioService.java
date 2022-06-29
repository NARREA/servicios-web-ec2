package com.idat.EC2JuanNarreaBodega.service;

import java.util.List;

import com.idat.EC2JuanNarreaBodega.model.Usuario;

public interface UsuarioService {
	
	void guardarUsuario(Usuario usuario);
	
	void actualizarUsuario(Usuario usuario);
	
	void eliminarUsuario(Integer id);
	
	List<Usuario> listarUsuario();
	
	Usuario obtenerUsuarioId(Integer id);

}
