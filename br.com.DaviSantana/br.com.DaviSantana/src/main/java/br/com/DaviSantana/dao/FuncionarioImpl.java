package br.com.DaviSantana.dao;

import org.springframework.stereotype.Repository;

import br.com.DaviSantana.domain.Funcionario;



@Repository
public class FuncionarioImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
