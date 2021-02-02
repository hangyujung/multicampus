package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello", "/hello.do" },loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
    	System.out.println("HelloServlet() 객체 생성 ");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("init()   call");    
    }
    
    @Override
    public void destroy() {
    	System.out.println(" destroy()   call ");   
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println(" service()   call ");
    	String name = request.getParameter("name");
    	String id = request.getParameter("id");
    	
    	PrintWriter out = response.getWriter();
    	
    	out.print("<table border='1'>");
    	out.print("  <tr> <td>"+ name+"</td> <td>"+id +"</td> </tr>");
    	out.print("</table>");
    	
	}
    
    
    
    /*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println(" doGet()   call ");
    	String name = request.getParameter("name");
    	String id = request.getParameter("id");
    	
    	PrintWriter out = response.getWriter();
    	
    	out.print("<table border='1'>");
    	out.print("  <tr> <td>"+ name+"</td> <td>"+id +"</td> </tr>");
    	out.print("</table>");
    	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");

		System.out.println(" doPost()   call ");
    	String name = request.getParameter("name");
    	String id = request.getParameter("id");
    	
    	PrintWriter out = response.getWriter();
    	
    	out.print("<table border='1'>");
    	out.print("  <tr> <td>"+ name+"</td> <td>"+id +"</td> </tr>");
    	out.print("</table>");
	}
*/
}
