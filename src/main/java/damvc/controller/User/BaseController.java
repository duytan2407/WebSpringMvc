package damvc.controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import damvc.Service.User.CategoryServiceImpl;
import damvc.Service.User.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _HomeService;
	@Autowired
	CategoryServiceImpl _CategoryService;
	public ModelAndView _mvShare = new ModelAndView();
	
	
	@PostConstruct
	public ModelAndView Init()
	{
		_mvShare.addObject("slide",_HomeService.GetDataSlide());
		return _mvShare;
	}
}
