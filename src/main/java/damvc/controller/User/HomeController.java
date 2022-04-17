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
		ModelAndView _mvShare = new ModelAndView("user/sanpham");
		_mvShare.addObject("idsp", id);
		return _mvShare;
	}
}
