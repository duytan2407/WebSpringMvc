package damvc.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import damvc.Dto.CartDto;

@Service
public interface ICartService {
	public HashMap<String, CartDto> Addcart(String id, HashMap<String, CartDto> cart);
	public HashMap<String, CartDto> Editcart(String id,int quanty, HashMap<String, CartDto> cart);
	public HashMap<String, CartDto> Deletecart(String id, HashMap<String, CartDto> cart);
	public int Total(HashMap<String, CartDto> cart);
	public double TotalPrice(HashMap<String, CartDto> cart);
	

}
