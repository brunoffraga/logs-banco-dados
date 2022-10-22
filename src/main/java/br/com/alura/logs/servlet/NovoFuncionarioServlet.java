package br.com.alura.logs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoFuncionarioServlet
 */
@WebServlet("/novoFuncionario")
public class NovoFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//pegar o que esta me fornecendo e transformar em uma string
    	String nomeFuncionario = req.getParameter("nome");
    	//inicializar o que vou devolver
    	PrintWriter out = resp.getWriter();
    	//reponder
    	out.print("<html><body>Cadastrado " + nomeFuncionario + " funcionario com sucesso</body></html>");
    }

}
