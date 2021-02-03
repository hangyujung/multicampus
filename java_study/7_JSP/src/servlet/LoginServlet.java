package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

@WebServlet({ "/login.do", "/logout.do" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//logout.do"
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if(session != null)   session.invalidate();
		
		response.sendRedirect("index.jsp");
	}
	
	
    //login.do
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		UserDAO dao = new UserDAO();
		UserService service = new UserServiceImpl(dao);
		
		UserVO vo = service.login(id, pw);
		

		if(vo != null) {
			//System.out.println("로그인 성공");
			HttpSession session = request.getSession();
			session.setAttribute("login", vo);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}else {
			request.setAttribute("msg", "로그인 실패");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}
}








