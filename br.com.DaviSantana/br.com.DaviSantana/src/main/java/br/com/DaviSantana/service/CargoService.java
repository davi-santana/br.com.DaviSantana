package br.com.DaviSantana.service;

import java.util.List;

import br.com.DaviSantana.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionario(Long id);
	
	

}
