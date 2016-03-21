package br.csi.model.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBDPostgres {
	
	public static void main(String args[]){
		ConectaBDPostgres.getConexao();
		System.out.println("conexao aberta! ");
	}
	
	public static Connection getConexao(){
		Connection c = null;
		
		try{
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/appRevisaoJavaWeb";
		String user ="postgres";
		String password ="1234";
		c = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return c;
	}
	
	
}
