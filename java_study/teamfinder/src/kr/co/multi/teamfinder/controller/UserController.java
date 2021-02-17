package kr.co.multi.teamfinder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.multi.teamfinder.dto.User;
import kr.co.multi.teamfinder.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	@PostMapping("/login.do")
	public String login(HttpSession session, @ModelAttribute User user){
		
		user.setUser_Id(user.getUser_Id());
		user.setUser_Pwd(user.getUser_Pwd());
		int result = userService.login(user);
		
		
		if(result==1) {
			session.setAttribute("loginCheck", true);
			session.setAttribute("id", user.getUser_Id());
			return "redirect:/index";
		}else {
			return "redirect:/user/login";
		}
	
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
    public String logoutProcess(HttpSession session) {
                            
        session.setAttribute("loginCheck",null);
        session.setAttribute("id",null);
        
        return "redirect:/index";
    }
	
	@GetMapping("/signup")
	public String signup() {
		return "user/signup";
	}
	
	@RequestMapping(value = "/memberIdChk", method = RequestMethod.POST)
	@ResponseBody
	public String memberIdChkPOST(String memberId) throws Exception{
		
		int result = userService.idCheck(memberId);
		
			if(result != 0) {
				return "fail"; // 중복 아이디가 존재 
			}
			else { 
				return "success"; // 중복 아이디 x 
			}
	}

		
	 // memberIdChkPOST() 종료

	
	@PostMapping("/join")
	public String join(@ModelAttribute User user) {
		int result = userService.joinUser(user);
		if(result == 1)
			return "redirect:/index";
		else
			return "redirect:/user/signup";
	}
	
	
	@GetMapping("/list")
	public String list(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("userList", users);
		return "user/list2";
	}
	
}
