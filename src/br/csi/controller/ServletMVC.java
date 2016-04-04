package br.csi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.csi.controller.logica.LogarLogica;
<<<<<<< HEAD
import br.csi.controller.logica.Logica;
=======
>>>>>>> b68f3ed5d3e8fedfec28666b4f3ef99e0989279f

/**
 * Servlet implementation class ServletMVC
 */
@WebServlet(name = "mvc", urlPatterns = { "/mvc" })
public class ServletMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Entrou mvc");
		String log = request.getParameter("logica");
		String classe = "br.csi.controller.logica."+log;
		System.out.println("Valor do log "+log);
		System.out.println("Vai carregar classe "+classe);
		
		try{
		
		Class classeCarregada = Class.forName(classe);
<<<<<<< HEAD
		Logica logLogica = (Logica) classeCarregada.newInstance();
		String fluxo = logLogica.executa(request, response);
		request.getRequestDispatcher(fluxo).forward(request, response);
		}catch (Exception e){
			e.printStackTrace();
=======
		LogarLogica logLogica = (LogarLogica) classeCarregada.newInstance();
		String fluxo = logLogica.executa(request, response);
		request.getRequestDispatcher(fluxo).forward(request, response);
		}catch (Exception e){
			//e.printStackTrace();
>>>>>>> b68f3ed5d3e8fedfec28666b4f3ef99e0989279f
		}
		
		}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
