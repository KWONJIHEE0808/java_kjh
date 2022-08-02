package kr.green.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home(ModelAndView mv, String hobby, Integer time){
	    mv.setViewName("/main/home");
	    mv.addObject("name", "홍길동");
	    mv.addObject("age", "20");
	    System.out.println("취미는 "+hobby+"이고 "+time+"시간씩 합니다.");
	    return mv;
	}	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView homePost(ModelAndView mv, String hobby, Integer time){
	    mv.setViewName("/main/home");
	    System.out.println("취미는 "+hobby+"이고 "+time+"시간씩 합니다.");
	    return mv;
	}	
	
	@RequestMapping(value= "/hobby/{hobby1}/{time1}")
	public ModelAndView hobby(ModelAndView mv, 
			@PathVariable("hobby1") String hobby, 
			@PathVariable("time1") Integer time){
	    mv.setViewName("redirect:/");
	    System.out.println("취미는 "+hobby+"이고 "+time+"시간씩 합니다.");
	    return mv;
	}	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv){
	    mv.setViewName("/main/login");
	    return mv;
	}	
	
}
