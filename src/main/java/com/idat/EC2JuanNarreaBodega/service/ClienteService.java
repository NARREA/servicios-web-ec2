package com.idat.EC2JuanNarreaBodega.service;

import java.util.List;

import com.idat.EC2JuanNarreaBodega.model.Cliente;

public interface ClienteService {
	
void guardarCliente(Cliente cliente);
	
	void actualizarCliente(Cliente cliente);
	
	void eliminarCliente(Integer id);
	
	List<Cliente> listarCliente();
	
	Cliente obtenerClientId(Integer id);

}
