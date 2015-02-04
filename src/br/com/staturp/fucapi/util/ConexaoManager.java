/**
 * O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância.
 * Tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que 
 * forneça um ponto global de acesso a ela.
 * A partir disso, podemos obter uma unica conexao. 
 * 
 */
package br.com.staturp.fucapi.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author LiborioJhimmy
 * @version 1
 * @since 18/01/2015
 *
 */
public  class  ConexaoManager {

	private final String user   = "fucapi";
	private final String senha  = "fucapi";
	private final String schema = "evento";
	private final String host = "localhost:3306";
	private final String url  = "jdbc:mysql://"+host+"/"+schema;

	private static  ConexaoManager INSTANCE = null;
	private static  Connection      conexao = null;
 

	
	public  Connection getConexaoManager()   {
		try{
			if (conexao == null){
				DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Isso também pode ser necessário em alguns servidores de aplicação e web
				conexao =  DriverManager.getConnection(url, user, senha);
			}
			return conexao;
		}catch(Exception e){
			throw new RuntimeException();
		}
	}

	
	//CRIA UMA UNICA INSTANCIA
	public static synchronized ConexaoManager getIntancia() {
		if(INSTANCE == null){
			System.out.println("Instanciou");
			INSTANCE =  new ConexaoManager();
			return INSTANCE;
		}else{
			return INSTANCE;
		}
	}



}
