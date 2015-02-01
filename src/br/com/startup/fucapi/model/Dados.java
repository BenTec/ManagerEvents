/**
 * 
 */
package br.com.startup.fucapi.model;


/**
 * @author Jhimmy Liborio, Clara Aben-Athar
 * @version 1
 * @since 27/01/2015
 *
 */
public abstract class Dados {
	
	
	
    private String nome;
    private String sobrenome;
	private char   sexo;
	private String contato;
	private String cpf;
	private String email;
	private String webSite;
	private Atividade atividade;
	private Cadastro  cadastro = new Cadastro();// EMAIL E SENHA PARA CORDENADOR
	
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
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the celular
	 */
	public String getContato() {
		return contato;
	}
	/**
	 * @param celular the celular to set
	 */
	public void setContato(String contato) {
		this.contato = contato;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the atividade
	 */
	public Atividade getAtividade() {
		return atividade;
	}
	/**
	 * @param atividade the atividade to set
	 */
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
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
	 * @return the webSite
	 */
	public String getWebSite() {
		return webSite;
	}
	/**
	 * @param webSite the webSite to set
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
    
	
}
