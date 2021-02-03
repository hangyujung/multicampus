package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;

@WebServlet("/deleteBook.do")
public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		
		String[] bookno = request.getParameterValues("bookno");
		
		for(String n :bookno) {
			service.bookDelete(Integer.parseInt(n));
		}
		
		response.sendRedirect("listBook.do");
	}

}
