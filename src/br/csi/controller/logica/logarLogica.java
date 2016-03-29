package br.csi.controller.logica;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.csi.model.Usuario;
import br.csi.model.dao.UsuarioDao;

public class LogarLogica implements Logica{

	public String executa(HttpServletRequest rq, HttpServletResponse rp){
		
		System.out.println("...dentro do executa LogarLogica");
		
		String login = rq.getParameter("login");
		String senha = rq.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		
		UsuarioDao uD = new UsuarioDao();
		
		//uD.autenticado(u);
		
		String pagina = "/index.jsp";
		
		try{
			boolean retorno = uD.autenticado(u);
			if(retorno){
				pagina = "/WEB-INF/jsp/principal.jsp";
				rq.setAttribute("usuario", u);
			}
			else{
				rq.setAttribute("msg", "Problemas ao logar");
			}
		}catch(SQLException e){
			e.printStackTrace();
			rq.setAttribute("msg", "Problemas ao logar");
			return pagina;
		}
		
		
		return pagina;   //"/WEB-INF/jsp/principal.jsp"
	}
	
}
