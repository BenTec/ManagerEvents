/**
 * 
 */
package br.com.startup.fucapi.model;

/**
 * @author Equipe
 * @version 1
 * @since 31/01/2015
 */
public class Local {
	
	String endereco;
	String complemento;
	String cidade;
	String estado;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
