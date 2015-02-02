/**
 * 
 */
package br.com.startup.fucapi.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.startup.fucapi.model.Congresso;
import br.com.startup.fucapi.model.Local;
import br.com.startup.fucapi.model.Organizador;
import br.com.staturp.fucapi.util.ConexaoManager;


/**
 * @author JhimmyLiborio
 * @version 1
 * @since 28/01/2015
 *
 */
public class CongressoDAO {
	
	private ConexaoManager conexaoManager;
	public CongressoDAO() {
		//OBTEM UMA UNICA INSTANCIA DE UMA CLASSE DO CONEXAOMANAGER (Padrão Singleton)
		conexaoManager = ConexaoManager.getIntancia();
	}

	
	//SALVAR
	public void  salvarCongresso(Congresso congresso, Organizador organizador){
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO congresso ");
		sql.append("(nome, descricao, categoria, data_inicio, hora_inicio, data_fim, hora_fim, local, valor, vagas, cidade, estado, Cadastro_id) ");
		sql.append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,? , ? , ? )");
		
		
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setString(1, congresso.getNome());
			pstm.setString(2, congresso.getDescricao());
			pstm.setString(3, congresso.getCategoria());
			pstm.setDate(4, new Date(congresso.getData_inicio().getTime()));
			pstm.setString(5, congresso.getHora_icnio());
			pstm.setDate(6, new Date(congresso.getData_fim().getTime()));
			pstm.setString(7, congresso.getHora_fim());
			pstm.setString(8, congresso.getLocal().getEndereco());
			pstm.setDouble(9, congresso.getValor());
			pstm.setInt(10, congresso.getVagas());
			pstm.setString(11, congresso.getLocal().getCidade());
			pstm.setString(12, congresso.getLocal().getEstado());
			pstm.setLong(13, organizador.getCadastro().getId()); // Congresso relacionado a um ID de cadastro de um organizador
			pstm.executeUpdate();
			pstm.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	//lISTAR CONGRESSO DE UM ORGANIZADOR
	public List<Congresso> listarCongresso(Organizador organizador){
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, nome, descricao, categoria, data_inicio, hora_inicio, data_fim, hora_fim, local, valor, vagas, cidade, estado, Cadastro_id ");
		sql.append("FROM congresso WHERE Cadastro_id = ? ORDER BY data_inicio; ");
		
		List<Congresso> list = null;
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setLong(1, organizador.getCadastro().getId());
			ResultSet rs =  pstm.executeQuery();
			
			list = new ArrayList<Congresso>();
			while(rs.next()){
				
				Congresso congresso = new Congresso();
				Local local = new Local(); // AGREGAÇÃO
				local.setEndereco(rs.getString("local"));
				local.setCidade(rs.getString("cidade"));
				local.setEstado(rs.getString("estado"));
				
				congresso.setId(rs.getLong("id"));
				congresso.setNome(rs.getString("nome"));
				congresso.setDescricao(rs.getString("descricao"));
				congresso.setCategoria(rs.getString("categoria"));
				congresso.setData_inicio(rs.getDate("data_inicio"));
				congresso.setHora_icnio(rs.getString("hora_inicio"));
				congresso.setVagas(rs.getInt("vagas"));
				congresso.setValor(rs.getDouble("valor"));
				congresso.setData_fim(rs.getDate("data_fim"));
				congresso.setHora_fim(rs.getString("hora_fim"));
				congresso.setLocal(local);	
				list.add(congresso);
				
			}	
			pstm.close(); 
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public void editarCongresso(Congresso congresso){
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE congresso ");
		sql.append("SET nome = ?, descricao = ?, categoria = ?, data_inicio = ?, hora_inicio = ?, data_fim = ?, "
				+ "hora_fim = ?, local = ?, cidade = ?, estado = ?, vagas = ?, valor = ?  ");
		sql.append("WHERE id = ? ");
		
		try {
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setString(1, congresso.getNome());
			pstm.setString(2, congresso.getDescricao());
			pstm.setString(3, congresso.getCategoria());
			pstm.setDate(4, new Date(congresso.getData_inicio().getTime()));
			pstm.setString(5, congresso.getHora_icnio());
			pstm.setDate(6, new Date(congresso.getData_fim().getTime()));
			pstm.setString(7, congresso.getHora_fim());
			pstm.setString(8, congresso.getLocal().getEndereco());
			pstm.setString(9, congresso.getLocal().getCidade());
			pstm.setString(10, congresso.getLocal().getEstado());
			pstm.setInt(11, congresso.getVagas());
			pstm.setDouble(12, congresso.getValor());
			pstm.setLong(13, congresso.getId());
			pstm.executeUpdate();
			pstm.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//EXCLUIR CONGRESSO DE UM ORGANIZADOR
	public void excluirCongresso(Congresso congresso){
		
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM congresso ");
		sql.append("WHERE id =  ? ");
		
		try{
			Connection connection = conexaoManager.getConexaoManager();
			PreparedStatement pstm = connection.prepareStatement(sql.toString());
			pstm.setLong(1, congresso.getId());
			pstm.executeUpdate();
			pstm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
