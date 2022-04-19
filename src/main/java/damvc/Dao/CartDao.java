package damvc.Dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.taglibs.standard.lang.jstl.AndOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import damvc.Dto.CartDto;
import damvc.Dto.ProductsDto;
@Repository
public class CartDao extends BaseDao {
	@Autowired
	productsDao productsD = new productsDao();

	public HashMap<String, CartDto> Addcart(String id, HashMap<String, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductsDto product = productsD.FindProductByID(id);
		if (product != null && cart.containsKey(id) ) {
			itemCart = cart.get(id);
			itemCart.setquanty(itemCart.getquanty()+1);	
			itemCart.setTotal(itemCart.getquanty()*itemCart.getProduct().getUnit_price());
			
		}
		else {
			itemCart.setProduct(product);
			itemCart.setquanty(1);
			itemCart.setTotal(product.getUnit_price());
		}
		cart.put(id, itemCart);
		return cart;
	}

	public HashMap<String, CartDto> Editcart(String id, int quanty, HashMap<String, CartDto> cart) {

		if (cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();

		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setquanty(quanty);
			double total = quanty * itemCart.getProduct().getUnit_price();
			itemCart.setTotal(total);
		}
		cart.put(id, itemCart);
		return cart;
	}

	public HashMap<String, CartDto> Deletecart(String id, HashMap<String, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	public int Total(HashMap<String, CartDto> cart) {
		int Total = 0;
		for (Map.Entry<String, CartDto> itemCart : cart.entrySet()) {
			Total += itemCart.getValue().getquanty();
		}
		return Total;
	}

	public double TotalPrice(HashMap<String, CartDto> cart) {
		double TotalPrice = 0;
		for (Map.Entry<String, CartDto> itemCart : cart.entrySet()) {
			TotalPrice += itemCart.getValue().getTotal();
		}
		return TotalPrice;
	}
}
