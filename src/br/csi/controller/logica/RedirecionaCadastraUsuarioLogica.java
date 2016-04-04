package br.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.csi.model.dao.UsuarioDao;

public class RedirecionaCadastraUsuarioLogica implements Logica{

	
	public String executa(HttpServletRequest rq, HttpServletResponse rp ){
		System.out.println("...entrou em RedirecionaCadastraUsuarioLogica...");
		rq.setAttribute("usuarios", new UsuarioDao().getUsuarios());
		
		return "/WEB-INF/jsp/CadastraUsuario.jsp";
	}
}
