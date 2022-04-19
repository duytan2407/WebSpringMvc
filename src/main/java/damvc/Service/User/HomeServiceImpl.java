package damvc.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damvc.Dao.productsDao;
import damvc.Dao.SlideDao;
import damvc.Dao.Type_productsDao;
import damvc.Dto.ProductsDto;
import damvc.Entity.Slide;
import damvc.Entity.Type_products;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private SlideDao slideDao;
	@Autowired
	private Type_productsDao typeDao;
	@Autowired
	private productsDao productsDao;
	

	public List<Slide> GetDataSlide() {

		return slideDao.getDataSlide();
	}

	public List<Type_products> GetDataType() {

		return typeDao.getDataType();
	}
	public List<ProductsDto> getDataProducts() {
		List<ProductsDto> listProducts = productsDao.getDataProducts();
		return listProducts;
	}

	

}
