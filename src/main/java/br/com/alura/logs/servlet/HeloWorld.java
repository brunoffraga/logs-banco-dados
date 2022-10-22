package br.com.alura.logs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//precisa de um servlet com o protocologo http
//nome vai ser http://localhost/Logs/oi
@WebServlet(urlPatterns = "/oi")
public class HeloWorld extends HttpServlet{

	//requizi��o -> pergunta e resposta
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("parabens seu lindo");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("esta funcionando no tomcat");
	}
}
