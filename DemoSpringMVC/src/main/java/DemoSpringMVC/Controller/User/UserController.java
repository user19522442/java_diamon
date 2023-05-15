package DemoSpringMVC.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Entity.Users;

@Controller
public class UserController extends BaseController{
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
		public ModelAndView Register() {
			_mvShare.addObject("user", new Users());
			_mvShare.setViewName("user/account/register");
		return _mvShare;
		}
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public ModelAndView CreateAcc(@ModelAttribute("user") Users user) {
		
		return _mvShare;
	}
}