package com.danielsv.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielsv.cursomc.domain.Categoria;
import com.danielsv.cursomc.repositories.CategoriaRepository;
import com.danielsv.cursomc.services.exceptions.ObjectNotFoundExpection;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundExpection("Objeto não identificado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}
