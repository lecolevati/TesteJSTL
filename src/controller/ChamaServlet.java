package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chamaservlet")
public class ChamaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChamaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> lista = new ArrayList<String>();
		for (int i = 0 ; i <= 10 ; i++){
			lista.add("Elemento "+i);
		}
		int rnd = (int)(Math.random() * 1000);
		String nomeVariavel = "lista" + String.valueOf(rnd); 
		request.setAttribute(nomeVariavel, lista);
		request.setAttribute("nomeVariavel", nomeVariavel);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
