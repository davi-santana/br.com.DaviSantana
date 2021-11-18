package br.com.DaviSantana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.DaviSantana.dao.DepartamentoDao;
import br.com.DaviSantana.domain.Departamento;


@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDao dao;
	
	@Override
	public void salvar(Departamento departameto) {
		dao.save(departameto);
		
	}

	@Override
	public void editar(Departamento departameto) {
		dao.update(departameto);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
