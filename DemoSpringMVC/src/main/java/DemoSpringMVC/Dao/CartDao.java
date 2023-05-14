package DemoSpringMVC.Dao;

import java.util.HashMap;
import java.util.Map;

import DemoSpringMVC.Dto.CartDto;
import DemoSpringMVC.Dto.ProductsDto;

public class CartDao extends BaseDao {
	ProductsDao productsDao = new ProductsDao();

	public HashMap<Long, CartDto> AddCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductsDto product = productsDao.FindProductsByID(id);
		if (product != null) {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCart);

		return cart;
	}

	public HashMap<Long, CartDto> EditCart(long id, int quanty, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
		}

		cart.put(id, itemCart);

		return cart;
	}

	public HashMap<Long, CartDto> DeleteCart(long id, HashMap<Long, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}

		return cart;
	}

	public int TotalQaunty(HashMap<Long, CartDto> cart) {
		int totalQuanty = 0;
		for (Map.Entry<Long,CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}

	public double TotalPrice(HashMap<Long, CartDto> cart) {
		int totalPrice = 0;
		for (Map.Entry<Long,CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}