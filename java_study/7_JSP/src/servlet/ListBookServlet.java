package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/listBook.do")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("/listBook.do  요청 처리 ");

		PrintWriter out = response.getWriter();
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);

		List<BookVO> list = service.bookList();
		
		request.setAttribute("list", list);
		
		String view = "/bookList.jsp";
		
		getServletContext().getRequestDispatcher(view).forward(request, response);
		

//		for (BookVO data : list) {
//			out.print(data.getBookno());      //  <td><%= data.getBookno() %>    </td>
//			out.print(data.getTitle());       //  <td><%= data.getTitle() %></td>
//			out.print(data.getPublisher());   //  <td><%= data.getPublisher() %></td>
//		}
		
		
	}

}






