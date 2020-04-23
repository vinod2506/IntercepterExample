package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.service.WishMsg;

@Controller
public class WishController {

	@Autowired
	private WishMsg service;
	
	
	@RequestMapping("/show")
	public String show(Model m) {
         String msg=service.generateWishMsg();
         m.addAttribute("msg", msg);
		return "show";
	}
	
}
