package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {
	
	//Metodos del CRUD
			public List<Fabricante> listarFabricantes(); //Listar All 
			
			public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un Fabricante CREATE
			
			public Fabricante fabricanteXID(Long id); //Leer datos de un Fabricante READ
			
			public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del Fabricante UPDATE
			
			public void eliminarFabricante(Long id);// Elimina el Fabricante DELETE

}
