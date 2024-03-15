package com.example.ITAP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ITAP_Controller {
	
		@RequestMapping("/reqhome")
		public String intro1()
		{
			return "ReqHomePage";
		}
		@RequestMapping("/dr")
		public String intro()
		{
			return "NewApplication";
		}
		@RequestMapping("/ma")
		public String ma()
		{
			return "Maintenance_activity_form";
		}
		@RequestMapping("/rechome")
		public String recommender_homepage()
		{
			return "RecHomePage";
		}
		@RequestMapping("/apphome")
		public String approver_homepage()
		{
			return "ApproverHomePage";
		}
		@RequestMapping("/random")
		public String random()
		{
			return "random";
		}

}
