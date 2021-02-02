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
import vo.BookVO;

@WebServlet("/addBook.do")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 데이터 베이스에 등록 
		request.setCharacterEncoding("utf-8");
		System.out.println("/addBook.do  요청 처리 ");
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		
		BookVO vo = new BookVO();
		
		vo.setPrice(Integer.parseInt(request.getParameter("price")));
		vo.setPublisher(request.getParameter("publisher"));
		vo.setTitle(request.getParameter("title"));
		
		service.bookAdd(vo);
		
	    response.sendRedirect("listBook.do");
	}

}
