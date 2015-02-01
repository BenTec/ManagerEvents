/**
 * 
 */
package br.com.startup.fucapi.model;

import java.util.Date;

/**
 * @author  Jhimmmy Liborio, Clara Aben-Athar
 * @version 1
 * @since   27/01/2015
 */ 
public class Congresso {
	
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Date data_inicio;
	private String hora_icnio;
	private Date data_fim;
	private String hora_fim;
	private String local;
	private Double valor;
	private Cadastro cadastro;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the data_inicio
	 */
	public Date getData_inicio() {
		return data_inicio;
	}
	/**
	 * @param data_inicio the data_inicio to set
	 */
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	/**
	 * @return the hora_icnio
	 */
	public String getHora_icnio() {
		return hora_icnio;
	}
	/**
	 * @param hora_icnio the hora_icnio to set
	 */
	public void setHora_icnio(String hora_icnio) {
		this.hora_icnio = hora_icnio;
	}
	/**
	 * @return the data_fim
	 */
	public Date getData_fim() {
		return data_fim;
	}
	/**
	 * @param data_fim the data_fim to set
	 */
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	/**
	 * @return the hora_fim
	 */
	public String getHora_fim() {
		return hora_fim;
	}
	/**
	 * @param hora_fim the hora_fim to set
	 */
	public void setHora_fim(String hora_fim) {
		this.hora_fim = hora_fim;
	}
	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * @return the cadastro
	 */
	public Cadastro getCadastro() {
		return cadastro;
	}
	/**
	 * @param cadastro the cadastro to set
	 */
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
