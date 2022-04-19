package damvc.controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import damvc.Dto.CartDto;

@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = { "/", "trang-chu" })
	public ModelAndView Index()

	{
		_mvShare.addObject("type", _HomeService.GetDataType());
		_mvShare.addObject("product", _HomeService.getDataProducts());
		_mvShare.setViewName("user/Home");
		return _mvShare;
	}

	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id)
	{
	
		_mvShare.addObject("AllIdpro",_CategoryService.GetAllProductsByID(Integer.parseInt(id)));
		_mvShare.setViewName("user/sanpham");
		return _mvShare;
	}
	@RequestMapping(value = {"chi-tiet/{id}"})
	public ModelAndView Detail(@PathVariable String id)

	{
		_mvShare.addObject("product",_ProductService.GetProductByID(Integer.parseInt(id)));
		_mvShare.setViewName("user/Detail");

		return _mvShare;
	}
	@RequestMapping(value = {"Addcart/{id}"})
	public String addcart(HttpServletRequest request,HttpSession session , @PathVariable String id )

	{
		HashMap<String,CartDto > cart = (HashMap<String,CartDto>)session.getAttribute("Cart");
		if(cart == null )
		{
			cart = new HashMap<String, CartDto>(); 
		}
		_CartServiceImpl.Addcart(id, cart);
		session.setAttribute("Cart",cart);
		session.setAttribute("Totalquanty",_CartServiceImpl.Total(cart));
		session.setAttribute("TotalPrice",_CartServiceImpl.TotalPrice(cart));
		//return "redirect:/chi-tiet/"+id;
		return "redirect:"+ request.getHeader("Referer");
	}
	@RequestMapping(value = {"Deletecart/{id}"})
	public String Deletecart(HttpServletRequest request,HttpSession session , @PathVariable String id )

	{
		HashMap<String,CartDto > cart = (HashMap<String,CartDto>)session.getAttribute("Cart");
		if(cart == null )
		{
			cart = new HashMap<String, CartDto>(); 
		}
		cart = _CartServiceImpl.Deletecart(id, cart);
		session.setAttribute("Cart",cart);
		session.setAttribute("Totalquanty",_CartServiceImpl.Total(cart));
		session.setAttribute("TotalPrice",_CartServiceImpl.TotalPrice(cart));
		//return "redirect:/chi-tiet/"+id;
		return "redirect:"+ request.getHeader("Referer");
	}
	@RequestMapping(value = "/list-cart")
	public ModelAndView Product()

	{
		ModelAndView mView = new ModelAndView("user/List-Cart");
//		mView.setView(null)
		return mView;
	}
	
}
