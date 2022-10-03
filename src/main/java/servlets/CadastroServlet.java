package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.Skate;
import dados.BancoDeDados;

@WebServlet (urlPatterns = "/sktcad")
public class CadastroServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				Skate s = new Skate();
				s.setTipoSkate(req.getParameter("sktP"));
				s.setMarcaSkate(req.getParameter("mrcP"));
				
				BancoDeDados.insert(s);
				
				PrintWriter escritor = resp.getWriter();
				escritor.write("<html>");
				escritor.write("<head>");
				escritor.write("<title>Lista de skates</title>");
				escritor.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
				escritor.write("</head>");
				escritor.write("<body style=\"background: #6C7A89;\">");
				escritor.write("<div class=\"listaOrdenada\">");
				escritor.write("<div><h1>Lista de Skates</h1></div>");
				escritor.write("<div class=\"boxOrdenada\">");
				escritor.write("<ol>"+BancoDeDados.select()+"</ol>");
				escritor.write("</div>");
				escritor.write("</div>");
				escritor.write("<br/><a class=\"linkVoltar\" id=\"linkCadastro\" href=\"index.html\">voltar</a>");
				escritor.write("</body>");
				escritor.write("</html>");
	}
}
