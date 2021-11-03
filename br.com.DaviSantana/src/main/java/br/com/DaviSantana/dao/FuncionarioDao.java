package br.com.DaviSantana.dao;

import java.util.List;

import br.com.DaviSantana.domain.Funcionario;

public interface FuncionarioDao {
void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
