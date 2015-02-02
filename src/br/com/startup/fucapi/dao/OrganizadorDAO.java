package br.com.startup.fucapi.dao;
/**
 * 
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.startup.fucapi.model.Cadastro;
import br.com.startup.fucapi.model.Organizador;
import br.com.staturp.fucapi.util.ConexaoManager;

/**
 * @author  JhimmyLiborio, Clara Ab-athar
 * @version 1
 * @since 27/01/2015
 *
 */
public class OrganizadorDAO {
	
	private ConexaoManager conexaoManager;
	
	public OrganizadorDAO() {
		//OBTEM UMA UNICA INSTANCIA DE UMA CLASSE DO CONEXAOMANAGER (Padrao Singleton)
		conexaoManager = ConexaoManager.getIntancia();
	}
	
	//Cadasro de organizador
	public void cadastrarOrganizador(Organizador organizador){
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO login ");
		sql.append("(email, senha) ");
		sql.append("VALUES(?,?)");
		
		
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setString(1, organizador.getCadastro().getEmailCadastro());
			pstm.setString(2, organizador.getCadastro().getSenha());
			pstm.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	//Editar dados Organizador
	public void editarDadosOrganizador(Organizador organizador){
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE organizador ");
		sql.append("set nome = ?, email = ?, contato = ?, website = ? , Cadastro_id = ? ");
		
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setString(1, organizador.getNome()+" "+organizador.getSobrenome());
			pstm.setString(2, organizador.getEmail());
			pstm.setString(3, organizador.getContato());
			pstm.setString(4, organizador.getWebSite());
			pstm.setLong(5, organizador.getCadastro().getId());
			pstm.executeUpdate();
			pstm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	//AUTENTICAR
	public Organizador autenticar(Organizador organizador){
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, email, senha FROM login ");
		sql.append("WHERE  email = ? and senha = ?");
		
		
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setString(1, organizador.getCadastro().getEmailCadastro());
			pstm.setString(2, organizador.getCadastro().getSenha());
			ResultSet rs =  pstm.executeQuery();
			
			Cadastro cadastro = null;
			if (rs.next()){
				 cadastro = new Cadastro();
				 cadastro.setId(rs.getLong("id"));
				 cadastro.setEmailCadastro(rs.getString("email"));
				 cadastro.setSenha(rs.getString("senha"));
				 organizador.setCadastro(cadastro);
			}else{
				organizador = null;
			}
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return organizador;
	}
}
