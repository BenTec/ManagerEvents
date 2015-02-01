/**
 * Cadastro de organizadores e ministrantes(Futuramente)
 * 
 */
package br.com.startup.fucapi.model;

/**
 * @author JhimmyLiborio, Clara Aben-Atar
 * @version 1
 * @since 27/01/2015
 */
public class Cadastro {
	
	private Long   id;
	private String emailCadastro;
	private String senha;

		
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
	 * @return the emailCadastro
	 */
	public String getEmailCadastro() {
		return emailCadastro;
	}
	/**
	 * @param emailCadastro the emailCadastro to set
	 */
	public void setEmailCadastro(String emailCadastro) {
		this.emailCadastro = emailCadastro;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
}
