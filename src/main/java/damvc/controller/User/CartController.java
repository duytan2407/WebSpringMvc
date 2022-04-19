//package damvc.controller.User;
//
//import java.util.HashMap;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
////import damvc.Dto.CartDto;
////import damvc.Service.User.CartServiceImpl;'
//import damvc.Entity.*;
//import damvc.Service.User.BillsServiceImpl;
//
//@Controller
//public class CartController extends BaseController{
//	
//	@Autowired
//	private BillsServiceImpl billsService = new BillsServiceImpl();
//
//	
//	@RequestMapping(value = "checkout", method = RequestMethod.GET)
//	public ModelAndView CheckOut(HttpServletRequest request, HttpSession session) {
//		_mvShare.setViewName("user/bills/checkout");
//		Bills bills = new Bills();
//		Users loginInfo = (Users)session.getAttribute("LoginInfo");
//		if(loginInfo != null) {
//			bills.setAddress(loginInfo.getAddress());
//			bills.setFull_name(loginInfo.getFull_name());
//			bills.setPhone(loginInfo.getPhone());
//			bills.setEmail(loginInfo.getEmail());
//		}
//		_mvShare.addObject("bills", bills);
//		return _mvShare;
//	}
//	@RequestMapping(value = "checkout", method = RequestMethod.POST)
//	public String CheckOutBill(HttpServletRequest request, HttpSession session,@ModelAttribute("bills") Bills bill) {
//		if(billsService.AddBills(bill)>0) {
//			HashMap<Long, CartDto> carts = (HashMap<Long, CartDto>)session.getAttribute("Cart");
//			billsService.AddBillsDetail(carts);
//		}
//		session.removeAttribute("Cart");;
//		return "redirect:gio-hang";
//	}
//}
