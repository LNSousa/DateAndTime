package com.lsousa.timedate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {

		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, YYYY");
		Date date = new Date();
		model.addAttribute("date", formatter.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {

		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
		Date time = new Date();
		model.addAttribute("date", formatter.format(time));
		return "time.jsp";
	}
}
