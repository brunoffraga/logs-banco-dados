package br.com.alura.logs.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {

	// gera o indentificador para puxar de outro local
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeEmpresa;
	private String descricaoEmpresa;
	private String categoriaEmpresa;
	private Date dataEmpresa;
	
	public Empresa() {
	}

	public Empresa(String nomeEmpresa, String descricaoEmpresa, String categoriaEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
		this.descricaoEmpresa = descricaoEmpresa;
		this.categoriaEmpresa = categoriaEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Date getDataEmpresa() {
		return dataEmpresa;
	}

	public void setDataEmpresa(Date dataEmpresa) {
		this.dataEmpresa = dataEmpresa;
	}

	public String getDescricaoEmpresa() {
		return descricaoEmpresa;
	}

	public void setDescricao(String descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}

	public String getCategoriaEmpresa() {
		return categoriaEmpresa;
	}

	public void setCategoria(String categoriaEmpresa) {
		this.categoriaEmpresa = categoriaEmpresa;
	}

}
