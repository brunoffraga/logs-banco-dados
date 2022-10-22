package br.com.alura.logs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.alura.logs.dao.EmpresaDao;
import br.com.alura.logs.model.Empresa;
import br.com.alura.logs.util.JPAUtil;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// dopost serve para não mostra minha senha
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrada uma nova empresa");
		
		// pegar o que esta me fornecendo e transformar em uma string
		String nomeEmpresa = request.getParameter("nome");
		String descricaoEmpresa = request.getParameter("descricao");
		String categoriaEmpresa = request.getParameter("categoria");

		Empresa empresa = new Empresa(nomeEmpresa, descricaoEmpresa, categoriaEmpresa);
		
		//introduzir no banco de dados
		EntityManager em = JPAUtil.getEntityManager();
		EmpresaDao empresaDao = new EmpresaDao(em);
		
		em.getTransaction().begin();

        empresaDao.cadastraEmpresa(empresa);

        em.getTransaction().commit();
        em.close();
		
		// inicializar o que vou devolver
		PrintWriter out = response.getWriter();

		// reponder
		out.println("<html><body>Empresa: " + nomeEmpresa + "</br>" + "descrição: " + descricaoEmpresa + "</br>"
				+ "categoria: " + categoriaEmpresa + "</br>" + "cadastrada com sucesso</body></html>");
	}
}
