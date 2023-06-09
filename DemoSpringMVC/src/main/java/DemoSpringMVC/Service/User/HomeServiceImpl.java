package DemoSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.CategorysDao;
import DemoSpringMVC.Dao.MenuDao;
import DemoSpringMVC.Dao.ProductsDao;
import DemoSpringMVC.Dao.SlidesDao;
import DemoSpringMVC.Dto.ProductsDto;
import DemoSpringMVC.Entity.Categorys;
import DemoSpringMVC.Entity.Menus;
import DemoSpringMVC.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slideDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	public List<Slides> GetDataSlide() {
		
		return slideDao.GetDataSlide();
	}
	public List<Categorys> GetDataCategorys() {
		
		return categorysDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		
		return menuDao.GetDataMenus();
	}
	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> liProductsDtos = productsDao.GetDataProducts();
		return liProductsDtos;
	}
}
