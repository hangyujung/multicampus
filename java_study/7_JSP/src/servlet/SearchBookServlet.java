package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

@WebServlet("/searchBook.do")
public class SearchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			                                                throws ServletException, IOException {
	    //http://localhost:9000/7_JSP/searchBook.do?condition=title&keyword=
		
		request.setCharacterEncoding("utf-8");
		
		String condition = request.getParameter("condition");
		String keyword = request.getParameter("keyword");
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		
		List<BookVO> list = service.searchBook(condition, keyword);
		
		request.setAttribute("list", list);
		String view = "/bookList.jsp";

		
		getServletContext().getRequestDispatcher(view).forward(request, response);
		
	}

}
