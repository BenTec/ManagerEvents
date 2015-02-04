/**
 * 
 */
package br.com.startup.fucapi.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.startup.fucapi.dao.OrganizadorDAO;
import br.com.startup.fucapi.model.Organizador;
import br.com.staturp.fucapi.util.Mensagem;
import br.com.staturp.fucapi.util.Util;


/**
 * @author JhimmyLiborio, Clara ab-atar
 * @version 1
 * @see 29/01/2015
 * 
 */

@ManagedBean
@SessionScoped
public class AutenticarBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Organizador organizador;

	
	//LOGIN
	public String logar(){
		
		OrganizadorDAO odao = new OrganizadorDAO();
		organizador = odao.autenticar(organizador);

		if (organizador != null){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("organizador", organizador);
			Mensagem.sucesso("Bem-vindo", organizador.getCadastro().getEmailCadastro());
			return "/pages/adm/painel.xhtml?faces-redirect=true";
		}else{
			Mensagem.erro("Login: Email ou senha errado", "");
		}
		
		return ""; // FICA NA MESMA PÁGINA
	}
	
	//LOGOUT
	public String logout(){
		Util.retirarOrganizadorSessao();
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		organizador = null;
		return "/pages/public/login.xhtml?face-redirect=true";
	}
	
	
	
	
//-------------------------- GETERS E SETERS ------------------------------
	
	/**
	 * @return the organizador
	 */
	public Organizador getOrganizador() {
		if(organizador == null){
			organizador = new Organizador();
		}
		return organizador;
	}

	/**
	 * @param organizador the organizador to set
	 */
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	
	
	
}
