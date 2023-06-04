package DemoSpringMVC.Controller.User;

import javax.websocket.server.PathParam;

import org.sonatype.inject.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Service.User.IProductService;

@Controller
public class ProductController extends BaseController{
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = {"/chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable long id) {
		
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product",_productService.GetProductByID(id));
		int idCategory = _productService.GetProductByID(id).getId_category();
		_mvShare.addObject("productByIDCategory",_productService.GetProductsByIDCategory(idCategory));
		return _mvShare;
	}
//	get all the product
	@RequestMapping(value = {"/product"})
	public ModelAndView GetAllProduct() {
		
		_mvShare.setViewName("user/products/allproduct");
		_mvShare.addObject("allproduct",_productService.GetAllProduct());
		return _mvShare;
	}
// filter by A to Z
	@RequestMapping(value = {"/product/AtoZ"})
	public ModelAndView GetProductAtoZ() {
		
		_mvShare.setViewName("user/products/allproduct");
		_mvShare.addObject("allproduct",_productService.GetAllProductAtoZ());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/product/caothap"})
	public ModelAndView GetProductCaoThap() {
		
		_mvShare.setViewName("user/products/allproduct");
		_mvShare.addObject("allproduct",_productService.GetAllProductCaoThap());
		return _mvShare;
	}

//	search
	@RequestMapping(value = {"/search"},method = RequestMethod.GET)
	public ModelAndView Search(@PathParam("keyword") String keyword) {
		
		_mvShare.setViewName("user/products/allproduct");
		_mvShare.addObject("allproduct",_productService.Search(keyword));
		return _mvShare;
	}
	
}
