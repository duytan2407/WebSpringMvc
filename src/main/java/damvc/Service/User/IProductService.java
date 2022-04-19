package damvc.Service.User;

import org.springframework.stereotype.Service;

import damvc.Dto.ProductsDto;

@Service
public interface IProductService {
	
	public ProductsDto GetProductByID(int id);
}
