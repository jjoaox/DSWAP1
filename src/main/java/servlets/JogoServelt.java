package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/jg")
public class JogoServelt  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int numero = Integer.parseInt(req.getParameter("numero"));
		int rand = (int)(Math.random()*(6 - 1)+1);
		String resultado;
		if(numero == rand) {
			resultado = "Acertou!";
		}else {
			resultado = "Errou!";
		}
		
		PrintWriter escritor = resp.getWriter();
		escritor.write("<html>");
		escritor.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"><title>Lista de jogos</title></head>");
		escritor.write("<body>");
		if(resultado == "Errou!") {
			escritor.write("<div style=\"background-color:#A52A2A;\" class=\"resultadoSorteio\">");
		}else {
			escritor.write("<div style=\"background-color:#2E8B57;\" class=\"resultadoSorteio\">");
		}
		escritor.write("<div class=\"boxResultado\">");
		escritor.write("<h1 id=\"h1Resultado\">"+resultado+"</h1>");
		escritor.write("</div>");
		escritor.write("<div><a class=\"linkVoltar\" href=\"index.html\">voltar</a></div>");
		escritor.write("</div>");
		escritor.write("</body>");
		escritor.write("</html>");
	}
}
