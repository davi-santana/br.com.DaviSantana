package br.com.DaviSantana.service;

import java.util.List;

import br.com.DaviSantana.domain.Departamento;

public interface DepartamentoService {

	
	void salvar(Departamento departameto);
	
	void editar(Departamento departameto);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);
	
}
