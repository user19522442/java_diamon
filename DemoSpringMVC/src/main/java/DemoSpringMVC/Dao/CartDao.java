package DemoSpringMVC.Dao;

import java.util.HashMap;

import DemoSpringMVC.Dto.CartDto;
import DemoSpringMVC.Dto.ProductsDto;

public class CartDao extends BaseDao{
	ProductsDao productsDao = new ProductsDao();
	
	public CartDto AddCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductsDto product = productsDao.FindProductsByID(id);
		if(product != null) {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		
		return itemCart;
	}
}
