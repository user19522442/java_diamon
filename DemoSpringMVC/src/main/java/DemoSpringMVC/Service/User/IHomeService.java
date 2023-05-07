package DemoSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.ProductsDto;
import DemoSpringMVC.Entity.Categorys;
import DemoSpringMVC.Entity.Menus;
import DemoSpringMVC.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Categorys> GetDataCategorys();
	public List<Slides> GetDataSlide();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();
}
