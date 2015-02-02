/**
 * 
 */
package br.com.fucapi.OrganizadorTest;

import java.util.Calendar;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.startup.fucapi.dao.CongressoDAO;
import br.com.startup.fucapi.model.Cadastro;
import br.com.startup.fucapi.model.Congresso;
import br.com.startup.fucapi.model.Local;
import br.com.startup.fucapi.model.Organizador;

public class CongressoOrganizadorTest {
	
	CongressoDAO cdao = new CongressoDAO();
	
	@Test
	@Ignore
	public void cadastrarCongresso(){
		Cadastro cadastro = new Cadastro();
		cadastro.setId(1L); // id de um organizador que foi pego da sessao
		
		Organizador organizador = new Organizador();
		organizador.setCadastro(cadastro);
	
		Congresso congresso = new Congresso(); 
		congresso.setNome("4º Encontro dos Deseperados");
		congresso.setCategoria("Projeto");
		congresso.setDescricao("Definicao de Layout ");
		congresso.setVagas(50);
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.FEBRUARY, 10);
		
		congresso.setData_inicio(c.getTime());
		congresso.setHora_icnio("19:00");
		
		c.set(2015, Calendar.MARCH, 15);
		congresso.setData_fim(c.getTime());
		congresso.setHora_fim("22:00");
		
		
		Local local = new Local();
		local.setEndereco("Rua 18 Hileia 1 , 543");
		local.setCidade("Manaus");
		local.setEstado("Am");
		congresso.setLocal(local);
		congresso.setValor(20.00);
		
		congresso.setCadastro(cadastro);
		cdao.salvarCongresso(congresso, organizador);
		
	}//OK
	
	@Test //lista de congresso de um organizador autenticado
	@Ignore
	public void listarCongressoDoOrganizador(){
		
		//Passo 1 verifica se tem cadastro
		//Passo 2 retorna um organizador caso autenticacao seja valida
		
		Cadastro cadastro = new Cadastro(); 
		cadastro.setId(1L);   
		
		Organizador organizador = new Organizador();
		organizador.setCadastro(cadastro); 
		
		
		List<Congresso> list = cdao.listarCongresso(organizador);
		
		if (!list.isEmpty())
		for (Congresso congresso : list) {
			System.out.println("---------------------------------");
			System.out.println(congresso.getId());
			System.out.println(congresso.getNome());
			System.out.println(congresso.getDescricao());
			System.out.println(congresso.getCategoria());
			System.out.println(congresso.getData_inicio());
			System.out.println(congresso.getData_fim());
			System.out.println(congresso.getHora_icnio());
			System.out.println(congresso.getHora_fim());
			System.out.println(congresso.getLocal().getEndereco());
			System.out.println(congresso.getLocal().getCidade());
			System.out.println(congresso.getLocal().getEstado());
			System.out.println(congresso.getVagas());
			System.out.println(congresso.getValor());
			
		}
		else{
			System.out.println("Você não Congressos ->> redirecione para a pagina de criação");
		}
	}
	
	//EDITAR CONGRESSO OK
	@Test
	@Ignore
	public void editarCongresso(){
		Congresso congresso = new Congresso();
		congresso.setNome("1º Encontro de Softwares ");
		congresso.setVagas(50);
		congresso.setValor(30.);
		congresso.setId(1L);
		
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.FEBRUARY, 1);
		congresso.setData_inicio(c.getTime());
		
		
		c.set(2015, Calendar.FEBRUARY, 3);
		congresso.setData_fim(c.getTime());
		
		Local local = new Local();
		local.setCidade("Sao Paulo");
		congresso.setLocal(local);
		cdao.editarCongresso(congresso);
	}
	
	//EXCLUIR OK
	@Test
	public void excluir(){
		Congresso congresso = new Congresso();
		congresso.setId(4L);
		cdao.excluirCongresso(congresso);
	}

}
