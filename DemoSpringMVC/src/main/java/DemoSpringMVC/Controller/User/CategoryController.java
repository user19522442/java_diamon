package DemoSpringMVC.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Dto.PaginatesDto;
import DemoSpringMVC.Service.User.CategoryServiceImpl;
import DemoSpringMVC.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController{
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PaginateServiceImpl paginateService;
	
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {
		int totalProductsPage = 9;
		_mvShare.setViewName("user/products/category");
		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage,1);
		_mvShare.addObject("paginateInfo",paginateInfo);
		_mvShare.addObject("productsPaginate",categoryService.GetDataProductsPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		return _mvShare;
	}
}
