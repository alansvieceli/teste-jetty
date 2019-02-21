package br.com.alan.teste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alan.modelos.MyClassJetty;

@WebServlet(urlPatterns = { "/contato" })
public class ContatoServlet extends HttpServlet {

	private static final long serialVersionUID = -3405911526072653239L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MyClassJetty classe = new MyClassJetty("Alan", 37);
		
		PrintWriter writer = resp.getWriter();
		try {
			writer.print("<html><h2>--- Contato ---</h2></html>");
		} finally {
			writer.close();
		}
	}

}
