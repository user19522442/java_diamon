package DemoSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.ProductsDao;
import DemoSpringMVC.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> listProducts = productsDao.GetProductsByID(id);
		return listProducts.get(0);
	}
	public List<ProductsDto> GetProductsByIDCategory(int id) {		
		return productsDao.GetAllProductsByID(id);
	}

}
