package br.com.staturp.fucapi.util;
/**
 * 
 */


import javax.faces.context.FacesContext;

import br.com.startup.fucapi.model.Organizador;

/**
 * @author LiborioJhimmy
 * @version 1
 * @since 29/01/2015
 *
 */
public class Util {

	// PEGA UM ORGANIZADOR NA SESSAO
	public  static  Organizador pegarOrganizadorSessao(){
		Organizador organizador = (Organizador)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("organizador");
		return organizador;
	}

	// RETIRA UM ORGANIZADOR DA SESSAO
	public static void retirarOrganizadorSessao(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("organizador");
	}


}
