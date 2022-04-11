package damvc.controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import damvc.Service.User.HomeServiceImpl;



@Controller
public class HomeController extends BaseController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = {"/","trang-chu"})
	public ModelAndView Index()
	
	{
		ModelAndView mView = new ModelAndView("user/Home");
		mView.addObject("slide",HomeService.GetDataSlide());
		mView.addObject("type",HomeService.GetDataType());
		return mView;
	}
	@RequestMapping(value ="/san-pham")
	public ModelAndView Product()
	
	{
		ModelAndView mView = new ModelAndView("user/sanpham");
//		mView.setView(null)
		return mView;
	}
}
