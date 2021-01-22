package App;

import java.util.List;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class Test02_BookApp {

	public static void main(String[] args) {
		
		BookDAO dao = new BookDAO();
		
		BookService service = new BookServiceImpl(dao);

		BookVO vo = new BookVO();
		vo.setPrice(9900);
		vo.setTitle("Sql");
		vo.setPublisher("오라클");
		//service.bookAdd(vo);
		
		
		
		List<BookVO> list =  service.searchBook("PUBLISHEr","오");
		list.forEach(i->System.out.println(i));
		
	}

}
