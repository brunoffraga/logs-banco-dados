package br.com.alura.logs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.logs.model.Empresa;

public class EmpresaDao {
	
	private EntityManager entityManager;

	public EmpresaDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void cadastraEmpresa(Empresa empresa) {
		this.entityManager.persist(empresa);
	}
	
	public List<Empresa> buscaPorNome(String nome){
		//nome1 ou ?1
		String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome1";
		return entityManager.createQuery(jpql, Empresa.class)
				.setParameter("nome1", nome)
				.getResultList();
	}
}
