  /**
 * 
 */
package br.com.fucapi.OrganizadorTest;

import org.junit.Ignore;
import org.junit.Test;

import br.com.startup.fucapi.dao.OrganizadorDAO;
import br.com.startup.fucapi.model.Cadastro;
import br.com.startup.fucapi.model.Organizador;

/**
 * @author JhimmyLiborio
 * @version 1
 * @since 28/01/2015
 *
 */
public class CadastroOrganizadorTeste {
	
	
	
	@Test
	@Ignore
	public void cadastrarOrganizador(){
		Cadastro cadastro = new Cadastro();
		cadastro.setEmailCadastro("liboriojhimmy@gmail.com");
		cadastro.setSenha("12345678");
		Organizador organizador = new Organizador();
		organizador.setCadastro(cadastro);
		
		OrganizadorDAO odao = new OrganizadorDAO();
		odao.cadastrarOrganizador(organizador);
	}//OK
	
	
	
	@Test // AUTENTICAÇÃO
	public void autenticar(){
		Cadastro cadastro = new Cadastro();
		cadastro.setEmailCadastro("liboriojhimmy@gmail.com");
		cadastro.setSenha("12345678");
		
		Organizador organizador = new Organizador();
		organizador.setCadastro(cadastro);
		
		// vai pegar uma instancia da conexaoManager no Construtor
		OrganizadorDAO oDao = new OrganizadorDAO();
		
		organizador =  oDao.autenticar(organizador);
		
		if (organizador == null){
			System.out.println("Email e senha errado ");
		}
		else{
			System.out.println("Autenticado ");
			System.out.println(organizador.getCadastro().getId());
		}
	}//OK

}
