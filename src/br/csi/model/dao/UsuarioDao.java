package br.csi.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.csi.model.Usuario;
import br.csi.model.util.ConectaBDPostgres;

public class UsuarioDao {

	public static void main(String args[]){
		Usuario u = new Usuario();
		u.setLogin("");
		u.setSenha("");
		
	
	try

	{
		System.out.println("Autenticado? " + "" + new UsuarioDao().autenticado(u));
	}catch(
	SQLException e)
	{
		e.printStackTrace();
	}
	}

	public boolean autenticado(Usuario u) throws SQLException{
		boolean autenticado = false;
		
		Connection c = ConectaBDPostgres.getConexao();
		//Statement stmt = c.createStatement();
		
		//String sql = "select * from usuario where login = '"+u.getLogin()+"' and senha = '"+u.getSenha()+"';";
		//ResultSet rs = stmt.executeQuery(sql);
		
		String sql = "select * from usuario where " + "login = ? and senha =?";
		PreparedStatement stmtPre = c.prepareStatement(sql);
		stmtPre.setString(1, u.getLogin());
		stmtPre.setString(2, u.getSenha());
		
		ResultSet rs = stmtPre.executeQuery();
		while(rs.next()){
			long id = rs.getLong("id");
			String login = rs.getString("login");
			String senha = rs.getString("senha");
			autenticado = true;
		}
		
		return autenticado;
		
	}
}
