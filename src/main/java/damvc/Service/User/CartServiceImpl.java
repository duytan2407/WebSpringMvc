package damvc.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import damvc.Dao.CartDao;
import damvc.Dto.CartDto;
@Service
public class CartServiceImpl implements ICartService {
	@Autowired
	private CartDao cartDao = new CartDao() ;

	

	@Override
	public HashMap<String, CartDto> Editcart(String id, int quanty, HashMap<String, CartDto> cart) {
		
		return cartDao.Editcart(id, quanty, cart);
	}

	@Override
	public HashMap<String, CartDto> Deletecart(String id, HashMap<String, CartDto> cart) {
		
		return cartDao.Deletecart(id, cart);
	}

	@Override
	public int Total(HashMap<String, CartDto> cart) {
		
		return cartDao.Total(cart);
	}

	@Override
	public double TotalPrice(HashMap<String, CartDto> cart) {
		
		return cartDao.TotalPrice(cart);
	}

	@Override
	public HashMap<String, CartDto> Addcart(String id, HashMap<String, CartDto> cart) {
		
		return cartDao.Addcart(id, cart);
	}
	
}
