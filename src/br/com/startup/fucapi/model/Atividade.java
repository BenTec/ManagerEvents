/**
 * 
 */
package br.com.startup.fucapi.model;

/**
 * @author  Jhimmmy Liborio, Clara Aben-Athar
 * @version 1
 * @since   27/01/2015
 */ 
public class Atividade {
	
	private Long id;
	private String tipo;
	private String assunto;
	private int  vagas;
	private String hora_inicio;
	private String hora_fim;
	private double valor;
	private Congresso congresso = new Congresso();
	
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the assunto
	 */
	public String getAssunto() {
		return assunto;
	}
	/**
	 * @param assunto the assunto to set
	 */
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	/**
	 * @return the vagas
	 */
	public int getVagas() {
		return vagas;
	}
	/**
	 * @param vagas the vagas to set
	 */
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	/**
	 * @return the hora_inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}
	/**
	 * @param hora_inicio the hora_inicio to set
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
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
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @return the congresso
	 */
	public Congresso getCongresso() {
		return congresso;
	}
	/**
	 * @param congresso the congresso to set
	 */
	public void setCongresso(Congresso congresso) {
		this.congresso = congresso;
	}
	
	


}
