/**
 * FeedBack com o usuario
 */
package br.com.staturp.fucapi.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author JhimmyLiborio, Clara
 * @version 1
 * @since 29/01/2015
 */
public class Mensagem {
	
	public static void sucesso(String titulo, String corpo){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, corpo);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public static void alerta(String titulo, String corpo){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, titulo, corpo);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public static void erro(String titulo, String corpo){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, corpo);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
