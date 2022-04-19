package damvc.controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value = "/chi-tiet")
	public ModelAndView Product()

	{
		ModelAndView mView = new ModelAndView("user/Detail");

		return mView;
	}
}
