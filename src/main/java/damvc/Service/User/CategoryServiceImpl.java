package damvc.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damvc.Dao.productsDao;
import damvc.Dto.ProductsDto;
@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired	
	 private productsDao productsDao;
	@Override
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
}
