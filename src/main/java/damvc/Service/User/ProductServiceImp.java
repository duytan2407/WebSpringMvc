package damvc.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damvc.Dao.productsDao;
import damvc.Dto.ProductsDto;
@Service
public class ProductServiceImp implements IProductService{
	@Autowired
	productsDao  productsD = new productsDao();
	
	@Override
	public ProductsDto GetProductByID(int id) {
		List<ProductsDto > list = productsD.GetProductByID(id);
		return list.get(0);
	}

}
