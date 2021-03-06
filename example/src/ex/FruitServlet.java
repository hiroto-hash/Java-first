package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		Fruit f = new Fruit("いちご",700);
		request.setAttribute("fruit", f);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/fruit.jsp");
		dispatcher.forward(request, response);
	}
}
