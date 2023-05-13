package DemoSpringMVC.Service.User;

import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.ProductsDto;

@Service
public interface IProductService {
	
	public ProductsDto GetProductsByID(long id);
}
