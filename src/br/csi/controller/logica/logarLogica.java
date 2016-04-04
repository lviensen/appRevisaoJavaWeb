package br.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.csi.model.Usuario;
import br.csi.model.dao.UsuarioDao;

public class LogarLogica implements Logica{

	public String executa(HttpServletRequest rq, HttpServletResponse rp){
		
		System.out.println("...dentro do executa logarLogica");
		
		String login = rq.getParameter("login");
		String senha = rq.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		
		UsuarioDao uD = new UsuarioDao();
		
		return "/WEB-INF/jsp/principal.jsp";
	}
	
}
