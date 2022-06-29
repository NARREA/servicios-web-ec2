package com.idat.EC2JuanNarreaBodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JuanNarreaBodega.Repository.ProductosRepository;
import com.idat.EC2JuanNarreaBodega.model.Productos;

@Service
public class ProductosServiceImpl implements ProductoService{
	
	@Autowired
	ProductosRepository repository;

	@Override
	public void guardarProductos(Productos productos) {
		// TODO Auto-generated method stub
		repository.save(productos);
		
	}

	@Override
	public void actualizarProductos(Productos productos) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(productos);
		
	}

	@Override
	public void eliminarProductos(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Productos obtenerProductosId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
