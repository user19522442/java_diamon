package DemoSpringMVC.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller extends BaseController{
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("products", _homeService.GetDataProducts());
		_mvShare.setViewName("user/index");

		return _mvShare;
	}
	@RequestMapping(value = {"/contact"})
	public ModelAndView Contact() {
		_mvShare.setViewName("layouts/user/contact");

		return _mvShare;
	}
}
