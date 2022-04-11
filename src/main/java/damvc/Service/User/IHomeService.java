package damvc.Service.User;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damvc.Dto.ProductsDto;
import damvc.Entity.Slide;
import damvc.Entity.Type_products;
@Service
public interface IHomeService {
	@Autowired
	public List<Slide> GetDataSlide();
	public List<Type_products> GetDataType();
	public List<ProductsDto> getDataProductsDtos();
}

