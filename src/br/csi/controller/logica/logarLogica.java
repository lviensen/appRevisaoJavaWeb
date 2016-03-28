package br.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class logarLogica implements Logica{

	public String executa(HttpServletRequest rq, HttpServletResponse rp){
		
		System.out.println("...dentro do executa logarLogica");
		return "/WEB-INF/jsp/principal.jsp";
	}
	
}
